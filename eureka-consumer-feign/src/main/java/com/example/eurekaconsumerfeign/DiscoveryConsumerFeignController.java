package com.example.eurekaconsumerfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryConsumerFeignController {

    @Autowired
    DiscoveryConsumerFeignClient feignClient;

    @GetMapping("/discoveryConsumerFeign")
    public String discoveryConsumerFeign(){
        return feignClient.consumer();
    }
}
