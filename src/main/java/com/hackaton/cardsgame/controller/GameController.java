package com.hackaton.cardsgame.controller;

import com.hackaton.cardsgame.model.User;
import com.hackaton.cardsgame.service.TableService;
import com.hackaton.cardsgame.vo.Card;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api")
@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GameController {

    private final TableService tableService;

    @PostMapping(value = "/user/login")
    public User login(@RequestBody User user) {
        User player = tableService.addUser(user);
        List<Card> cards = tableService.getCardsToUser(5);
        player.setCards(cards);
        return player;
    }

    @PostMapping(value = "/user/{userId}/card/discard")
    public void discardCard(@PathVariable UUID userId, @RequestBody Card card) {
        tableService.discardCard(userId, card);

    }

    @GetMapping(value = "/cards/open")
    public List<Card> getOpenCards() {
        return tableService.getOpenCards();
    }

    @GetMapping(value = "/cards")
    public List<Card> getDeckCards() {
        return tableService.getAllCardsRemainingFromDeck();
    }

}
