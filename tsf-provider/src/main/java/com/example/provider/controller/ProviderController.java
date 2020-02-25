package com.example.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csz on 2020/2/19.
 */
@RestController
@RequestMapping("/pro")
public class ProviderController {

    @GetMapping(value = "/who/{name}")
    public String echo(@PathVariable String name) {
        return "Hi,"+ name + " this is tsfProvider.";
    }
}
