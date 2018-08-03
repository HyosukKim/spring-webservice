package com.cak.ao.springwebservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
    
    @GetMapping("/cak_hello")
    public String cak_hello() {
        return "CAK AO BU";
    }
}
