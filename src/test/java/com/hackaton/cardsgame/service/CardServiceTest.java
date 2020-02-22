package com.hackaton.cardsgame.service;

import com.hackaton.cardsgame.vo.Card;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CardServiceTest {

    @Test
    void getCards() {

        CardService cardService = new CardService();

        List<Card> cards = cardService.getCards(10);


    }
}