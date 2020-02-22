package com.hackaton.cardsgame.service;

import com.hackaton.cardsgame.vo.Card;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TableServiceTest {

    @Test
    void getCards() {

        TableService tableService = new TableService();

        List<Card> cards = tableService.getCardsToUser(10);


    }
}