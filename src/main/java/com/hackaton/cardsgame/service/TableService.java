package com.hackaton.cardsgame.service;

import com.hackaton.cardsgame.model.User;
import com.hackaton.cardsgame.vo.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class TableService {

    private final String[] values = {"jack", "queen", "king", "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private final String[] suits = {"spades", "hearts", "clubs", "diamonds"};

    List<Card> cards = new ArrayList<>();
    List<Card> openCards = new ArrayList<>();
    List<User> users = new ArrayList<>();

    public TableService() {
        for (final String value : values) {
            for (final String suit : suits) {
                cards.add(new Card(value, suit));
            }
        }
        Collections.shuffle(cards);
    }

    public List<Card> getAllCardsRemainingFromDeck() {
        return cards;
    }
    public List<Card> getCardsToUser(int n) {
        List<Card> popup = new ArrayList<>(cards.subList(0, n));
        this.cards.removeAll(popup);
        return popup;
    }

    public void discardCard(UUID userI, Card card) {
        User user = users.stream()
                .filter(u -> u.getUuid().equals(userI))
                .findFirst().get();
        user.getCards().remove(card);
        openCards.add(card);
    }

    public List<Card> getOpenCards() {
        return openCards;
    }

    public User addUser(User user) {
        user.setUuid(UUID.randomUUID());
        users.add(user);
        return user;
    }


}
