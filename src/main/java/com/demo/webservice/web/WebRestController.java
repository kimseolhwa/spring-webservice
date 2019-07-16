package com.demo.webservice.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebRestController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}
