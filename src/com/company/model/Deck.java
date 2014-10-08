package com.company.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Julia on 08.10.2014.
 */
public class Deck {

    public static final int MAX = 21;

    private static Random random;
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        for (int i = 0; i < Card.qualities.size(); i++) {
            for (int j = 0; j < Suit.DIAMONDS.ordinal(); j++) {
                cards.add(new Card(Suit.values()[j], Card.qualities.get(i)));
            }
        }
        random = new Random();
    }

    public Card getRandomCard() {
        int index = random.nextInt(cards.size());
        Card card = cards.get(index);
        cards.remove(card);
        return card;
    }
}
