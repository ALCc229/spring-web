package com.example.demo.web;

import com.example.demo.common.Result;
import com.example.demo.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class UserController {
     @Resource
     private UserService userService;

     //localhost:8080/a?id=
     @GetMapping("/a")
    public Result User(int id){

         return userService.getAgeById(id);
    }
}
