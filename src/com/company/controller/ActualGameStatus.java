package com.company.controller;

import java.util.Random;

public class ActualGameStatus {

    public static void main(String[] args) {

        System.out.println("Tic Tac Toe Game");
        System.out.println("player 1 uses X");
        System.out.println("player 2 uses O");

        System.out.println();

        Random rand = new Random();
        double whoIsFirstPlayer = rand.nextDouble();

        System.out.println("Who is the first player?");

        System.out.println();

        if (whoIsFirstPlayer <= 0.5) {
            System.out.println("Player 1 starts game");
        } else {
            System.out.println("Player 2 starts game");
        }


    }
}
