package com.blz.GamblingGame;

public class GamblingGame {

    public static final int STAKE_COST = 100;
    public static final int BET_COST = 1;

    public static void main(String[] args) {
        int bet = (int) Math.floor(Math.random() * 10) % 2;
        if (bet == 1)
            System.out.println("Win");
        else
            System.out.println("loose");

    }
}
