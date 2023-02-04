package com.example.jumptospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping(value = "/sbb")
    @ResponseBody
    public String index() {
        return "Hello Spring";
    }

    @GetMapping(value = "/")
    public String root() {
        return "redirect:/question/list";
    }

}
