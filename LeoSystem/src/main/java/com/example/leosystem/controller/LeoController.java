package com.example.leosystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("leo")
public class LeoController {

    @GetMapping("en")
    public String leo(int id){
      return "Liu En Yun";
    }
}
