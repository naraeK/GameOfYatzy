package com.narae.practice.gameofyatzy;

import java.util.HashMap;
import java.util.Random;

public class Player {
    public int[] dices = new int[5];
    public int chances;
    public String name;
    public int reroll_chances;
    private int ONE_ROUND = 15;
    public int REROLL_CHANCES = 3;
    public HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();

    Random random = new Random();
    public Player(String name) {
        chances = ONE_ROUND;
        reroll_chances = REROLL_CHANCES;
        this.name = name;
        this.scoreMap = scoreMap;
    }
}
