package com.narae.practice.gameofyatzy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    public   int[] dices = new int[5];
    public int chances;

    Random random = new Random();
    public Player() {
        chances = 1;
        int n;
        for (int i = 0; i < 5; i++) {
            //Random random = new Random();
            n = random.nextInt(6) + 1;
            dices[i] = n;
        }
    }
    public void rerolling(int[] dices, List<Boolean> whichDiceReroll) {
        int n;
        /*
        for (int dice :dices) {

        }*/
        if (chances > 3) {
            System.out.println("You already had three times rolling.");
        }

        for (int i = 0; i < dices.length; i++){
            n = random.nextInt(6) + 1;
            dices[i] = (chances <= 3 && whichDiceReroll.get(i).equals(true)) ? n : dices[i] ;
        }
    }
/*
    void rolling() {
        //default - test
        int n;

        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            n = rand.nextInt(6) + 1;
            player[i] = n;
        }
    /*
    public int getplayer(){

    }

    }
    */
}
