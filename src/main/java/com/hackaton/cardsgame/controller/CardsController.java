package com.hackaton.cardsgame.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cards")
public class CardsController {

    @GetMapping(value = "/user/{user}")
    public String getUser(@PathVariable String user) {
        return "Hello " + user + ", welcome to the game!";
    }


}
