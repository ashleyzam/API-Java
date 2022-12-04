package com.example.demo.controller;

import com.example.demo.dto.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @GetMapping("/hello")
    ResponseEntity<Object> sayHello(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);

    }
    @GetMapping("/client")
    ResponseEntity<Object> getClient(){
        Client client = new Client("Ashley", "Zamudio", false, 24);
        return new ResponseEntity<>(client, HttpStatus.OK);

    }
}
