package com.example.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by csz on 2020/2/19.
 */
@FeignClient("tsf-provider")
@RequestMapping("/pro")
public interface ProviderFeign {

    @GetMapping(value = "/who/{name}")
    String echo(@PathVariable("name") String name);
}
