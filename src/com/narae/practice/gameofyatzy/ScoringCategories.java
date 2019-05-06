package com.narae.practice.gameofyatzy;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class ScoringCategories {
    private int scores;



    public void chance (int[] dices){
        int sum = 0;
        for (int dice: dices) sum += dice;
        scores = sum;
    }

    public void yatzy (int[] dices) {
        boolean isYatzy = true;
        int i = 0;

        while (isYatzy && (i < 4) ) {
            isYatzy = (dices[i] == dices[i+1]);
            i++;
        }
        scores = (isYatzy == true) ? 50 : 0;
    }

    public void ones (int[] dices) {
        int sum = 0;
        for (int dice: dices) sum = (dice == 1) ? sum += dice : sum;
        scores = sum;
    }
    public void twos (int[] dices) {
        int sum = 0;
        for (int dice: dices) sum = (dice == 2) ? sum += dice : sum;
        scores = sum;
    }
    public void threes (int[] dices) {
        int sum = 0;
        for (int dice: dices) sum = (dice == 3) ? sum += dice : sum;
        scores = sum;
    }
    public void fours (int[] dices) {
        int sum = 0;
        for (int dice: dices) sum = (dice == 4) ? sum += dice : sum;
        scores = sum;
    }
    public void fives (int[] dices) {
        int sum = 0;
        for (int dice: dices) sum = (dice == 5) ? sum += dice : sum;
        scores = sum;
    }
    public void sixes (int[] dices) {
        int sum = 0;
        for (int dice: dices) sum = (dice == 6) ? sum += dice : sum;
        scores = sum;
    }

    public void pair (int[] dices) {
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        for (int dice: dices) {
            one = dice == 1 ? one += dice : one;
            two = dice == 2 ? two += dice : two;
            three = dice == 3 ? three += dice : three;
            four = dice == 4 ? four += dice : four;
            five = dice == 5 ? five += dice : five;
            six = dice == 6 ? six += dice : six;
        }
        int pair_score = 0;
        if (six > 6) {
            pair_score = 12;
        }else if(five > 5 && five > pair_score) {
            pair_score = 10;
        }else if(four > 4 && four > pair_score ) {
            pair_score = 8;
        }else if(three > 3 && three > pair_score) {
            pair_score = 6;
        }else if(two > 2 && two > pair_score) {
            pair_score = 4;
        }else if(one > 1 && one > pair_score) {
            pair_score = 2;
        }
        scores = pair_score;
    }
    public void twoPairs (int[] dices) {
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        for (int dice: dices) {
            one = dice == 1 ? one += dice : one;
            two = dice == 2 ? two += dice : two;
            three = dice == 3 ? three += dice : three;
            four = dice == 4 ? four += dice : four;
            five = dice == 5 ? five += dice : five;
            six = dice == 6 ? six += dice : six;
        }
        int isPair = 0;
        int twoPairs_score = 0;
        if (six > 6) {
            isPair += 1;
            twoPairs_score = 12;
        } if(five > 5) {
            isPair += 1;
            twoPairs_score += 10;
        } if(four > 4) {
            isPair += 1;
            twoPairs_score += 8;
        } if(three > 3) {
            isPair += 1;
            twoPairs_score += 6;
        } if(two > 2) {
            isPair += 1;
            twoPairs_score += 4;
        } if(one > 1) {
            isPair += 1;
            twoPairs_score += 2;
        }
        scores = isPair > 1 ? twoPairs_score : 0;
    }
    public void threeOfAKind (int[] dices) {
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        for (int dice: dices) {
            one = dice == 1 ? one += dice : one;
            two = dice == 2 ? two += dice : two;
            three = dice == 3 ? three += dice : three;
            four = dice == 4 ? four += dice : four;
            five = dice == 5 ? five += dice : five;
            six = dice == 6 ? six += dice : six;
        }
        int threeOfAKind_score = 0;
        if (six > 12) {
            threeOfAKind_score = 18;
        }else if(five > 10 && five > threeOfAKind_score) {
            threeOfAKind_score = 15;
        }else if(four > 8 && four > threeOfAKind_score ) {
            threeOfAKind_score = 12;
        }else if(three > 6 && three > threeOfAKind_score) {
            threeOfAKind_score = 9;
        }else if(two > 4 && two > threeOfAKind_score) {
            threeOfAKind_score = 6;
        }else if(one > 2 && one > threeOfAKind_score) {
            threeOfAKind_score = 3;
        }
        scores = threeOfAKind_score;
    }
    public void fourOfAKind (int[] dices) {
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        for (int dice: dices) {
            one = dice == 1 ? one += dice : one;
            two = dice == 2 ? two += dice : two;
            three = dice == 3 ? three += dice : three;
            four = dice == 4 ? four += dice : four;
            five = dice == 5 ? five += dice : five;
            six = dice == 6 ? six += dice : six;
        }
        int fourOfAKind_score = 0;
        if (six > 18) {
            fourOfAKind_score = 24;
        }else if(five > 15 && five > fourOfAKind_score) {
            fourOfAKind_score = 20;
        }else if(four > 12 && four > fourOfAKind_score ) {
            fourOfAKind_score = 16;
        }else if(three > 9 && three > fourOfAKind_score) {
            fourOfAKind_score = 12;
        }else if(two > 6 && two > fourOfAKind_score) {
            fourOfAKind_score = 8;
        }else if(one > 3 && one > fourOfAKind_score) {
            fourOfAKind_score = 4;
        }
        scores = fourOfAKind_score;
    }
    public void smallStraight (int[] dices){
        Set<Integer> smallstraight = new HashSet<Integer>();
        smallstraight.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
        Integer[] dicesInt = Arrays.stream(dices).boxed().toArray(Integer[]::new);
        Set<Integer> dicesSet = new HashSet<Integer>(Arrays.asList(dicesInt));
        scores = (dicesSet.equals(smallstraight)) ? 15 : 0;
    }
    public void largeStraight (int[] dices){
        Set<Integer> smallstraight = new HashSet<Integer>();
        smallstraight.addAll(Arrays.asList(new Integer[] {2,3,4,5,6}));
        Integer[] dicesInt = Arrays.stream(dices).boxed().toArray(Integer[]::new);
        Set<Integer> dicesSet = new HashSet<Integer>(Arrays.asList(dicesInt));
        scores = (dicesSet.equals(smallstraight)) ? 20 : 0;
    }
    public void fullHouse (int[] dices) {
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        for (int dice: dices) {
            one = dice == 1 ? one += dice : one;
            two = dice == 2 ? two += dice : two;
            three = dice == 3 ? three += dice : three;
            four = dice == 4 ? four += dice : four;
            five = dice == 5 ? five += dice : five;
            six = dice == 6 ? six += dice : six;
        }
        int isFullHouse = 0;
        int isPair = 0;
        int fullHouse_score = 0;
        if (six > 6) {
            isPair += 1;
            fullHouse_score = 12;
        } if(five > 5) {
            isPair += 1;
            fullHouse_score += 10;
        } if(four > 4) {
            isPair += 1;
            fullHouse_score += 8;
        } if(three > 3) {
            isPair += 1;
            fullHouse_score += 6;
        } if(two > 2) {
            isPair += 1;
            fullHouse_score += 4;
        } if(one > 1) {
            isPair += 1;
            fullHouse_score += 2;
        }
        scores = isPair > 1 ? fullHouse_score : 0;
    }

    /*
    private void diceElementsSum (int[] dices){
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        for (int dice: dices){
            one = dice == 1 ? one += dice : one;
            two = dice == 2 ? two += dice : two;
            three = dice == 3 ? three += dice : three;
            four = dice == 4 ? four += dice : four;
            five = dice == 5 ? five += dice : five;
            six = dice == 6 ? six += dice : six;
        }
    }
*/
    public int getScores(){
        return scores;
    }
}
