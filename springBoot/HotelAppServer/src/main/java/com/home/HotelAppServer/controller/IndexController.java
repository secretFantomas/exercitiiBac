package com.home.HotelAppServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/salut")
    public String showIndexPage() {
        return "index";
    }
}