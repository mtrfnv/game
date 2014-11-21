package com.company.model;

/**
 * Created by Julia on 08.10.2014.
 */
public class Player {

    private String name;
    private int score;
    private int money;
    private boolean isOverdrawn;
    private Card card;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isOverdrawn() {
        return isOverdrawn;
    }

    public void setOverdrawn(boolean isOverdrawn) {
        this.isOverdrawn = isOverdrawn;
    }

    public Player(String name) {
        this.name = name;
        score = 0;
        money = 100;
        isOverdrawn = false;
    }

    public void takeCard(Card card) {
        this.addScore(Card.values.get(card.getValue()));
    }

}
