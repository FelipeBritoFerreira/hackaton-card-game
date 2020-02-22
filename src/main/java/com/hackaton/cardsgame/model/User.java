package com.hackaton.cardsgame.model;

import com.hackaton.cardsgame.vo.Card;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class User {
    private UUID uuid;
    private String name;
    private List<Card> cards;
}
