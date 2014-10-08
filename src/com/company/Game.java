package com.company;

import com.company.model.Deck;
import com.company.model.Player;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

/**
 * Created by Julia on 08.10.2014.
 */
public class Game {
    
    private ArrayList<Player> players;
    private Player currentPlayer;
    private Deck deck;
    private ArrayList<Boolean> answers;
    private boolean isPlaying;

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public Game() {
        deck = new Deck();
        isPlaying  = true;
    }

    /**
     * Метод, заполняющий массив игроков.
     */
    public void init() {

        //todo: исправить этот метод
        players = new ArrayList<Player>() {{
            add(new Player("Васян"));
            add(new Player("Петр"));
        }};
        currentPlayer = players.get(0);

        answers = new ArrayList<Boolean>();
    }

    public void startGame() {
        for (Player player : players) {
            player.takeCard(deck.getRandomCard());
            player.takeCard(deck.getRandomCard());
        }
        isPlaying = true;
    }

    public void makeTurn(boolean isTakingCard) {
        if (isTakingCard) {
            currentPlayer.takeCard(deck.getRandomCard());
            answers.set(players.indexOf(currentPlayer), true);
        }
        else {
            answers.set(players.indexOf(currentPlayer), false);
        }


        int index = players.indexOf(currentPlayer);
        index++;
        if (players.size() == index) {
            index = 0;

            boolean endGameStage = true;
            for (Boolean answer : answers) {
                if (answer) {
                    endGameStage = false;
                    break;
                }
            }

            if (endGameStage)
                isPlaying = false;
        }

        currentPlayer = players.get(index);
    }


}
