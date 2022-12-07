package com.workshop.newsecurityjwt2022.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greetings")
public class GreertingsController {


    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from our API");
    }


    @GetMapping("/say-good-bye")
    public ResponseEntity<String> sayGoodBye0(){
        return ResponseEntity.ok("Good b byand see you later");
    }
}
