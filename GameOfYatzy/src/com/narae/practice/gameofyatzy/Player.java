package com.narae.practice.gameofyatzy;

import java.util.Random;

public class Player {
    public int[] dices = new int[5];
    public int chances;
    public String name;
    private int reroll_chances;
    private int ONE_ROUND = 15;
    private int REROLL_CHANCES = 3;

    Random random = new Random();
    public Player(String name) {
        chances = ONE_ROUND;
        reroll_chances = REROLL_CHANCES;
        this.name = name;
    }
}
