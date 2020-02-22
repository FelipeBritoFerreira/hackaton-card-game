package com.hackaton.cardsgame.controller;

import com.hackaton.cardsgame.model.User;
import com.hackaton.cardsgame.repository.UserRepository;
import com.hackaton.cardsgame.service.CardService;
import com.hackaton.cardsgame.vo.Card;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class LoginController {

    private final UserRepository userRepository;
    private CardService cardService;

    @PostMapping(value = "/login")
    public User login(@RequestBody User user) {
        User player = userRepository.save(user);
        List<Card> cards = cardService.getCards(5);
        player.setCards(cards);
        return player;
    }

}
