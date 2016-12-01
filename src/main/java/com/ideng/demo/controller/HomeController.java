package com.ideng.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Javier on 01/12/2016.
 */

@RestController
public class HomeController {
    @RequestMapping("/")
    public  String home(){

        return  "Hello word";
    }
}
