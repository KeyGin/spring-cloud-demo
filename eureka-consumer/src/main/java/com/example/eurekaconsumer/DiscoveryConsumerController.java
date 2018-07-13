package com.example.eurekaconsumer;

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

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/discoveryConsumer")
    public String discoveryConsumer(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("eurekaclient");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/discoveryClient";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
}
