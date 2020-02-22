package com.hackaton.cardsgame.service;

import com.hackaton.cardsgame.vo.Card;
import com.hackaton.cardsgame.vo.Rank;
import com.hackaton.cardsgame.vo.Suit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardService {

    List<Card> cards = new ArrayList<>(){{
        add(new Card(Rank.ACE, Suit.CLUBS));
        add(new Card(Rank.ACE, Suit.DIAMONDS));
        add(new Card(Rank.ACE, Suit.HEARTS));
        add(new Card(Rank.ACE, Suit.SPADES));
        add(new Card(Rank.TWO, Suit.CLUBS));
        add(new Card(Rank.TWO, Suit.DIAMONDS));
        add(new Card(Rank.TWO, Suit.HEARTS));
        add(new Card(Rank.TWO, Suit.SPADES));
        add(new Card(Rank.THREE, Suit.CLUBS));
        add(new Card(Rank.THREE, Suit.DIAMONDS));
        add(new Card(Rank.THREE, Suit.HEARTS));
        add(new Card(Rank.THREE, Suit.SPADES));
        add(new Card(Rank.FOUR, Suit.CLUBS));
        add(new Card(Rank.FOUR, Suit.DIAMONDS));
        add(new Card(Rank.FOUR, Suit.HEARTS));
        add(new Card(Rank.FOUR, Suit.SPADES));
        add(new Card(Rank.FIVE, Suit.CLUBS));
        add(new Card(Rank.FIVE, Suit.DIAMONDS));
        add(new Card(Rank.FIVE, Suit.HEARTS));
        add(new Card(Rank.FIVE, Suit.SPADES));
        add(new Card(Rank.SIX, Suit.CLUBS));
        add(new Card(Rank.SIX, Suit.DIAMONDS));
        add(new Card(Rank.SIX, Suit.HEARTS));
        add(new Card(Rank.SIX, Suit.SPADES));
        add(new Card(Rank.SEVEN, Suit.CLUBS));
        add(new Card(Rank.SEVEN, Suit.DIAMONDS));
        add(new Card(Rank.SEVEN, Suit.HEARTS));
        add(new Card(Rank.SEVEN, Suit.SPADES));
        add(new Card(Rank.EIGHT, Suit.CLUBS));
        add(new Card(Rank.EIGHT, Suit.DIAMONDS));
        add(new Card(Rank.EIGHT, Suit.HEARTS));
        add(new Card(Rank.EIGHT, Suit.SPADES));
        add(new Card(Rank.NINE, Suit.CLUBS));
        add(new Card(Rank.NINE, Suit.DIAMONDS));
        add(new Card(Rank.NINE, Suit.HEARTS));
        add(new Card(Rank.NINE, Suit.SPADES));
        add(new Card(Rank.TEN, Suit.CLUBS));
        add(new Card(Rank.TEN, Suit.DIAMONDS));
        add(new Card(Rank.TEN, Suit.HEARTS));
        add(new Card(Rank.TEN, Suit.SPADES));
        add(new Card(Rank.JACK, Suit.CLUBS));
        add(new Card(Rank.JACK, Suit.DIAMONDS));
        add(new Card(Rank.JACK, Suit.HEARTS));
        add(new Card(Rank.JACK, Suit.SPADES));
        add(new Card(Rank.QUEEN, Suit.CLUBS));
        add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        add(new Card(Rank.QUEEN, Suit.HEARTS));
        add(new Card(Rank.QUEEN, Suit.SPADES));
        add(new Card(Rank.KING, Suit.CLUBS));
        add(new Card(Rank.KING, Suit.DIAMONDS));
        add(new Card(Rank.KING, Suit.HEARTS));
        add(new Card(Rank.KING, Suit.SPADES));
    }};

    public CardService(){
        Collections.shuffle(cards);
    }

    public List<Card> getCards(int n) {
        List<Card> popup =  new ArrayList<Card>(cards.subList(0,n));
        this.cards.removeAll(popup);
        return popup;
    }

}
