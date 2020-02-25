package com.example.consumer.controller;

import com.example.consumer.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csz on 2020/2/19.
 */
@RestController
@RequestMapping("/con")
public class ConsumerController {

    @Autowired
    private ProviderFeign providerFeign;

    @GetMapping(value = "/who/{name}")
    public String echo(@PathVariable String name) {

        String echo = providerFeign.echo(name);


        return "Hi,"+ name + " this is tsConsumer. " + echo;
    }
}
