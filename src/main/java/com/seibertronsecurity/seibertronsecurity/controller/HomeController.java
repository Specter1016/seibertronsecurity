package com.seibertronsecurity.seibertronsecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

}
