package com.example.springWithoutDB.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    //@GetMapping()
    @GetMapping("/test")
    public String initial() {
        return "API working....";
    }

//    @PostMapping("/")
//    public String addData() {
//        return "Data received";
//    }


    @PostMapping("/")
    public user addData(@RequestBody user userData) {
        return userData;
    }
}

class user{
    public String name;
    public String email;
    public int age;
}

