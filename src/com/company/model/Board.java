package com.company.model;

public class Board {

    int xPosition = 3;
    int yPosition = 3;

    int [][] board = new int[xPosition][yPosition];

    public Board(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }


    //getters and setters for xPosition, yPosition, board (to define size of board)
    //creating view of start empty board

}
