package com.study.controller;

import com.study.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CountController {

    @Autowired
    private CountService countService;

    @GetMapping("/hello")
    public String count() {
        return countService.count();
    }


}
