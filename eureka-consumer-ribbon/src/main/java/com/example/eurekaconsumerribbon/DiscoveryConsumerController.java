package com.example.eurekaconsumerribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DiscoveryConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/discoveryConsumerRibbon")
    public String discoveryConsumer(){
        return restTemplate.getForObject("http://eurekaclient/discoveryClient", String.class);
    }
}
