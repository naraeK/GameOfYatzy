package com.narae.practice.gameofyatzy;

import java.util.*;

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
/*
    public HashSet<String> categories = new HashSet<String>();
    categories.addAll(Arrays.asList(new String[]{"chance", "yatzy", "ones", "twos", "threes", "fours", "fives", "sixes", "pair", "twoPairs",
                      "threeOfAKind", "fourOfAKind", "smallStraight", "largeStraight", "fullHouse"}));*/
    Scanner go = new Scanner(System.in);

    public Goes(Player player1, Player player2) {
        System.out.println("YOU HAVE TO USE EACH CATEGORY ONCE.\n ");
        // assumption - two players
        ScoringCategories categories = new ScoringCategories();
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
            player1_category = validName(player1_category);
            player1_category = validCategory(player1_category, player1_scoreMap);
            player1_scores = categories.getScores(player1_category, player1_dices);
            System.out.println("The chosen rule for "+player1.name + " is: " + player1_category + "\t\tScore: " + player1_scores);
            player1_scoreMap.replace(player1_category, player1_scores);

            System.out.println("\nThis go for " + player2.name + ":     " + Arrays.toString(player2_dices));
            System.out.println("Select a scoring rule for " + player2.name +
                    ":\nchance, yatzy, ones, twos, threes, fours, fives, sixes, pair, twoPairs," +
                    "threeOfAKind, fourOfAKind, smallStraight, largeStraight, fullHouse");
            player2_category = go.nextLine();
            player2_category = validName(player2_category);
            player2_category = validCategory(player2_category, player2_scoreMap);
            player2_scores = categories.getScores(player2_category, player2_dices);
            System.out.println("The chosen rule for " + player2.name + " is: " + player2_category + "\t\tScore: " + player2_scores);
            player2_scoreMap.replace(player2_category, player2_scores);
        }
        System.out.println(player1.name + ":\t" + player1_scoreMap);
        System.out.println(player2.name + ":\t" + player2_scoreMap);

        whosWinner(player1, player1_scoreMap, player2,  player2_scoreMap);
    }
    private void whosWinner(Player player1, HashMap<String, Integer> player1_scoreMap, Player player2, HashMap<String, Integer> player2_scoreMap){
        int finalScore_player1 = 0;
        int finalScroe_player2 = 0;
        for (int score_1: player1_scoreMap.values()){
            finalScore_player1 += score_1;
        }
        for (int score_2: player2_scoreMap.values()){
            finalScroe_player2 += score_2;
        }
        System.out.println(player1.name + " gets the final score " + finalScore_player1);
        System.out.println(player2.name + " gets the final score " + finalScroe_player2);
        Player winner = finalScore_player1 > finalScroe_player2 ? player1 : player2;
        int winner_score = finalScore_player1 > finalScroe_player2 ? finalScore_player1: finalScroe_player2;
        System.out.println("Winner is " + winner.name + " with the final score " + winner_score);
    }

    private String validCategory(String player_category, HashMap<String, Integer> player_scoreMap){
        HashSet<String> categories = new HashSet<String>();
        categories.addAll(Arrays.asList(new String[]{"chance", "yatzy", "ones", "twos", "threes", "fours", "fives", "sixes", "pair", "twoPairs",
                "threeOfAKind", "fourOfAKind", "smallStraight", "largeStraight", "fullHouse"}));
        while ((player_scoreMap.get(player_category) != null) || (!categories.contains(player_category))){
            System.out.println("'" + player_category + "' has been chosen. Please select unused one among them" +
                    ":\nchance, yatzy, ones, twos, threes, fours, fives, sixes, pair, twoPairs, " +
                    "threeOfAKind, fourOfAKind, smallStraight, largeStraight, fullHouse");
            player_category = go.nextLine();
            if ( !categories.contains(player_category)) {player_category = validName(player_category);}
        }
        return player_category;
    }


    public String validName(String player_category) {
        HashSet<String> categories = new HashSet<String>();
        categories.addAll(Arrays.asList(new String[]{"chance", "yatzy", "ones", "twos", "threes", "fours", "fives", "sixes", "pair", "twoPairs",
                "threeOfAKind", "fourOfAKind", "smallStraight", "largeStraight", "fullHouse"}));
        while (!categories.contains(player_category)) {
            System.out.println("Invalid name. Pleace pick one among: \nchance, yatzy, ones, twos, threes, fours, fives, sixes, pair, twoPairs, " +
                    "threeOfAKind, fourOfAKind, smallStraight, largeStraight, fullHouse");
            player_category = go.nextLine();
        }
        return player_category;
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
        player_scoreMap.put("chance", null);
        player_scoreMap.put("yatzy", null);
        player_scoreMap.put("ones", null);
        player_scoreMap.put("twos", null);
        player_scoreMap.put("threes", null);
        player_scoreMap.put("fours", null);
        player_scoreMap.put("fives", null);
        player_scoreMap.put("sixes", null);
        player_scoreMap.put("pair", null);
        player_scoreMap.put("twoPairs", null);
        player_scoreMap.put("threeOfAKind", null);
        player_scoreMap.put("fourOfAKind", null);
        player_scoreMap.put("smallStraight", null);
        player_scoreMap.put("largeStraight", null);
        player_scoreMap.put("fullHouse", null);
        return player_scoreMap;
    }

    private HashMap<String, Integer> setPlayer_scoreMap2(HashMap<String, Integer> player_scoreMap) {
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
