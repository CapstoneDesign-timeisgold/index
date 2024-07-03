package com.example.MapMarkerSetGet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/index1")
    public String getPage1() {
        return "index1";
    }

    @GetMapping("/index2")
    public String getPage2() {
        return "index2";
    }
}

