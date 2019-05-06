package com.narae.practice.gameofyatzy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // first rolling
        // extend more players by adding a class
        Player player1 = new Player();//int[] player1 = new int[5];
        Player player2 = new Player();//int[] player2 = new int[5];

        System.out.println("First go of Player1:     " + Arrays.toString(player1.dices));
        System.out.println("First go of Player2:     " + Arrays.toString(player2.dices));
        ScoringCategories categories = new ScoringCategories();
       // categories.chance(player1.dices);
       // int scores_player1 = categories.getScores();
        //System.out.println(scores_player1);
        //List<int> arb = ArrayList<int>(Arrays.asList(1,1,1,2,1));
        //player1.dices =arb;
        //categories.yatzy(player1.dices);
        //int scores_player1 = categories.getScores();
        //System.out.println(scores_player1);
        categories.twoPairs(player1.dices);
        int scores_player1 = categories.getScores();
        System.out.println(scores_player1);
/*
        // second rolling
        List<Boolean> whichDiceReroll = new ArrayList<Boolean>(Arrays.asList(true, true, false, true, false));
        //System.out.println(whichDiceReroll);
        player1.chances += 1;
        player1.rerolling(player1.dices, whichDiceReroll);
        System.out.println("Second go of Player1:    " + Arrays.toString(player1.dices));

        player2.chances += 1;
        player2.rerolling(player2.dices, whichDiceReroll);
        System.out.println("Second go of Player2:    " + Arrays.toString(player2.dices));

        // third rolling
        whichDiceReroll = new ArrayList<Boolean>(Arrays.asList(false, false, true, true, true));
        player1.chances += 1;
        player1.rerolling(player1.dices, whichDiceReroll);
        System.out.println("Final go of Player1:     " + Arrays.toString(player1.dices));

        player2.chances += 1;
        player2.rerolling(player2.dices, whichDiceReroll);
        System.out.println("Final go of Player2:     " + Arrays.toString(player2.dices));

/*
        // Rolling the dices
        void rolling () {
        //execute
        }
        void scoring () {
            int chanceScore = Chance(player1);
        }
        void comparingScores () {
        //  winner = finalScore_player1 >= finalScore_player2 ? finalScore_player1 : finalScore_player2 ;
        }

    */    // Scoring Rules
    }

}

