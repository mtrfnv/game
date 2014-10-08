package com.company.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Julia on 08.10.2014.
 */
public class Card {

    public static final ArrayList<String> qualities = new ArrayList<String>() {{
        add(0, "2");
        add(1, "3");
        add(2, "4");
        add(3, "5");
        add(4, "6");
        add(5, "7");
        add(6, "8");
        add(7, "9");
        add(8, "10");
        add(9, "J");
        add(10, "Q");
        add(11, "K");
        add(12, "A");
    }};

    public static final HashMap<String, Integer> values = new HashMap<String, Integer>() {{
        put("2", 2);
        put("3", 3);
        put("4", 4);
        put("5", 5);
        put("6", 6);
        put("7", 7);
        put("8", 8);
        put("9", 9);
        put("10",10);
        put("J", 2);
        put("Q", 3);
        put("K", 4);
        put("A", 11);
    }} ;

    private Suit suit;
    private int value;

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getValue() {
        return qualities.get(value);
    }

    public void setValue(String value) {
        this.value = qualities.indexOf(value);
    }

    public Card(Suit suit, String value) {
        this.suit = suit;
        this.value = qualities.indexOf(value);
    }
}
