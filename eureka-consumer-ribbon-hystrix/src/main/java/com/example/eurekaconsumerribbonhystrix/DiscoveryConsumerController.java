package com.example.eurekaconsumerribbonhystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DiscoveryConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/discoveryConsumerRibbonHystrix")
    public String discoveryConsumer(){
        return consumerService.consumer();
    }

    @Configuration
    class ConsumerService {

        @Autowired
        private RestTemplate restTemplate;

        @HystrixCommand(fallbackMethod = "fallback")
        public String consumer(){
            return restTemplate.getForObject("http://eurekaclient/discoveryClient", String.class);
        }

        public String fallback(){
            return "fallback";
        }
    }

}
