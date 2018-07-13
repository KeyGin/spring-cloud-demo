package com.example.eurekaconsumerfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eurekaclient")
public interface DiscoveryConsumerFeignClient {

    @GetMapping("/discoveryClient")
    String consumer();

}
