package com.example.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryClientController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/discoveryClient")
    public String discoveryClient(){
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
