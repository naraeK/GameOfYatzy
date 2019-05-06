package com.narae.practice.gameofyatzy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Goes {
    private Random random = new Random();
    int[] player1_dices = new int[5];
    int[] player2_dices = new int[5];
    private String player1_category;
    private String player2_category;
    private int player1_scores;
    private int player2_scores;
    public HashMap<String, Integer> player1_scoreMap = new HashMap<String, Integer>();
    public HashMap<String, Integer> player2_scoreMap = new HashMap<String, Integer>();


    public Goes(Player player1, Player player2) {
        System.out.println("You have to use each category once.\n ");
        // assumption - two players
        ScoringCategories categories = new ScoringCategories();
        Scanner go = new Scanner(System.in);
        player1_scoreMap = setPlayer_scoreMap(player1_scoreMap);
        player2_scoreMap = setPlayer_scoreMap(player2_scoreMap);

        while ((player1.chances > 0) || (player2.chances > 0)) {
            player1.chances--;
            player2.chances--;
            player1_dices = rolling(player1_dices);
            player2_dices = rolling(player2_dices);
            System.out.println("\nThis go for " + player1.name + ":     " + Arrays.toString(player1_dices));
            System.out.println("Select a scoring rule for " + player1.name +
                    ":\nchance, yatzy, ones, twos, threes, fours, fives, sixes, pair, twoPairs," +
                    "threeOfAKind, fourOfAKind, smallStraight, largeStraight, fullHouse");
            player1_category = go.nextLine();

            player1_scores = categories.getScores(player1_category, player1_dices);
            System.out.println("The chosen rule for "+player1.name + " is: " + player1_category + "\t\tScore: " + player1_scores);
            player1_scoreMap.replace(player1_category, player1_scores);

            System.out.println("\nThis go for " + player2.name + ":     " + Arrays.toString(player2_dices));
            System.out.println("Select a scoring rule for " + player2.name +
                    ":\nchance, yatzy, ones, twos, threes, fours, fives, sixes, pair, twoPairs," +
                    "threeOfAKind, fourOfAKind, smallStraight, largeStraight, fullHouse");
            player2_category = go.nextLine();
            player2_scores = categories.getScores(player2_category, player2_dices);
            System.out.println("The chosen rule for " + player2.name + " is: " + player2_category + "\t\tScore: " + player2_scores);
            player2_scoreMap.replace(player2_category, player2_scores);
        }
    System.out.println(player1_scoreMap);
    }

    private int[] rolling(int[] dices) {
        int n;
        for (int i = 0; i < 5; i++) {
            n = random.nextInt(6) + 1;
            dices[i] = n;
        }
        return dices;
    }

    private HashMap<String, Integer> setPlayer_scoreMap(HashMap<String, Integer> player_scoreMap) {
        player1_scoreMap.put("chance", null);
        player1_scoreMap.put("yatzy", null);
        player1_scoreMap.put("ones", null);
        player1_scoreMap.put("twos", null);
        player1_scoreMap.put("threes", null);
        player1_scoreMap.put("fours", null);
        player1_scoreMap.put("fives", null);
        player1_scoreMap.put("sixes", null);
        player1_scoreMap.put("pair", null);
        player1_scoreMap.put("twoPairs", null);
        player1_scoreMap.put("threeOfAKind", null);
        player1_scoreMap.put("fourOfAKind", null);
        player1_scoreMap.put("smallStraight", null);
        player1_scoreMap.put("largeStraight", null);
        player1_scoreMap.put("fullHouse", null);
        return player_scoreMap;
    }

    public HashMap<String, Integer> getPlayer1_scoreMap() {
        return player1_scoreMap;
    }

    public HashMap<String, Integer> getPlayer2_scoreMap() {
        return player2_scoreMap;
    }
    /* // TODO - rerolling method
    public void rerolling(int[] dices, List<Boolean> whichDiceReroll) {
        int n;

        if (chances > 3) {
            System.out.println("You already had three times rolling.");
        }

        for (int i = 0; i < dices.length; i++){
            n = random.nextInt(6) + 1;
            dices[i] = (chances <= 3 && whichDiceReroll.get(i).equals(true)) ? n : dices[i] ;
        }
    }
    */
}
