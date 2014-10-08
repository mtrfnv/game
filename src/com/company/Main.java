package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Game game = new Game() {{
            init();
            startGame();
        }};

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Текущий игрок: " + game.getCurrentPlayer().getName());
            System.out.println("У вас на руке: " + game.getCurrentPlayer().getScore());
            System.out.println("Желаете взять еще одну карту?");
            char answer = sc.nextLine().charAt(0);
            if (answer == 'y') {
                game.makeTurn(true);
            } else {
                game.makeTurn(false);
            }

        } while(game.isPlaying());

        System.out.println("Успех!");

    }
}
