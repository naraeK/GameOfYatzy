package com.narae.practice.gameofyatzy;

import java.util.*;

public class ScoringCategories {
    private int scores;
    Scanner go = new Scanner(System.in);
    String category;

    private int chance(int[] dices) {
        int sum = 0;
        for (int dice : dices) sum += dice;
        return scores = sum;
    }

    private int yatzy(int[] dices) {
        boolean isYatzy = true;
        int i = 0;

        while (isYatzy && (i < 4)) {
            isYatzy = (dices[i] == dices[i + 1]);
            i++;
        }
        return scores = (isYatzy == true) ? 50 : 0;
    }

    private int ones(int[] dices) {
        int sum = 0;
        for (int dice : dices) sum = (dice == 1) ? sum += dice : sum;
        return scores = sum;
    }

    private int twos(int[] dices) {
        int sum = 0;
        for (int dice : dices) sum = (dice == 2) ? sum += dice : sum;
        return scores = sum;
    }

    private int threes(int[] dices) {
        int sum = 0;
        for (int dice : dices) sum = (dice == 3) ? sum += dice : sum;
        return scores = sum;
    }

    private int fours(int[] dices) {
        int sum = 0;
        for (int dice : dices) sum = (dice == 4) ? sum += dice : sum;
        return scores = sum;
    }

    private int fives(int[] dices) {
        int sum = 0;
        for (int dice : dices) sum = (dice == 5) ? sum += dice : sum;
        return scores = sum;
    }

    private int sixes(int[] dices) {
        int sum = 0;
        for (int dice : dices) sum = (dice == 6) ? sum += dice : sum;
        return scores = sum;
    }

    private int pair(int[] dices) {
        List<Integer> elementsSum = diceElementsSum (dices);
        int one = elementsSum.get(0), two = elementsSum.get(1), three = elementsSum.get(2), four = elementsSum.get(3), five = elementsSum.get(4), six = elementsSum.get(5);

        int pair_score = 0;
        if (six > 6) {
            pair_score = 12;
        } else if (five > 5 && five > pair_score) {
            pair_score = 10;
        } else if (four > 4 && four > pair_score) {
            pair_score = 8;
        } else if (three > 3 && three > pair_score) {
            pair_score = 6;
        } else if (two > 2 && two > pair_score) {
            pair_score = 4;
        } else if (one > 1 && one > pair_score) {
            pair_score = 2;
        }
        return scores = pair_score;
    }

    private int twoPairs(int[] dices) {
        List<Integer> elementsSum = diceElementsSum (dices);
        int one = elementsSum.get(0), two = elementsSum.get(1), three = elementsSum.get(2), four = elementsSum.get(3), five = elementsSum.get(4), six = elementsSum.get(5);

        int isPair = 0;
        int twoPairs_score = 0;
        if (six > 6) {
            isPair += 1;
            twoPairs_score = 12;
        }
        if (five > 5) {
            isPair += 1;
            twoPairs_score += 10;
        }
        if (four > 4) {
            isPair += 1;
            twoPairs_score += 8;
        }
        if (three > 3) {
            isPair += 1;
            twoPairs_score += 6;
        }
        if (two > 2) {
            isPair += 1;
            twoPairs_score += 4;
        }
        if (one > 1) {
            isPair += 1;
            twoPairs_score += 2;
        }
        return scores = isPair > 1 ? twoPairs_score : 0;
    }

    private int threeOfAKind(int[] dices) {
        List<Integer> elementsSum = diceElementsSum (dices);
        int one = elementsSum.get(0), two = elementsSum.get(1), three = elementsSum.get(2), four = elementsSum.get(3), five = elementsSum.get(4), six = elementsSum.get(5);

        int threeOfAKind_score = 0;
        if (six > 12) {
            threeOfAKind_score = 18;
        } else if (five > 10 && five > threeOfAKind_score) {
            threeOfAKind_score = 15;
        } else if (four > 8 && four > threeOfAKind_score) {
            threeOfAKind_score = 12;
        } else if (three > 6 && three > threeOfAKind_score) {
            threeOfAKind_score = 9;
        } else if (two > 4 && two > threeOfAKind_score) {
            threeOfAKind_score = 6;
        } else if (one > 2 && one > threeOfAKind_score) {
            threeOfAKind_score = 3;
        }
        return scores = threeOfAKind_score;
    }

    private int fourOfAKind(int[] dices) {
        List<Integer> elementsSum = diceElementsSum (dices);
        int one = elementsSum.get(0), two = elementsSum.get(1), three = elementsSum.get(2), four = elementsSum.get(3), five = elementsSum.get(4), six = elementsSum.get(5);
        int isFullHouse = 0;
        int fullHouse_score = 0;
        for (int elementSum : elementsSum) {
            if (elementSum != 0) {
                isFullHouse += 1;
                fullHouse_score += elementSum;
            }
        }
        int fourOfAKind_score = 0;
        if (six > 18) {
            fourOfAKind_score = 24;
        } else if (five > 15 && five > fourOfAKind_score) {
            fourOfAKind_score = 20;
        } else if (four > 12 && four > fourOfAKind_score) {
            fourOfAKind_score = 16;
        } else if (three > 9 && three > fourOfAKind_score) {
            fourOfAKind_score = 12;
        } else if (two > 6 && two > fourOfAKind_score) {
            fourOfAKind_score = 8;
        } else if (one > 3 && one > fourOfAKind_score) {
            fourOfAKind_score = 4;
        }
        return scores = fourOfAKind_score;
    }

    private int smallStraight(int[] dices) {
        Set<Integer> smallstraight = new HashSet<Integer>();
        smallstraight.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        Integer[] dicesInt = Arrays.stream(dices).boxed().toArray(Integer[]::new);
        Set<Integer> dicesSet = new HashSet<Integer>(Arrays.asList(dicesInt));
        return scores = (dicesSet.equals(smallstraight)) ? 15 : 0;
    }

    private int largeStraight(int[] dices) {
        Set<Integer> largestraight = new HashSet<Integer>();
        largestraight.addAll(Arrays.asList(new Integer[]{2, 3, 4, 5, 6}));
        Integer[] dicesInt = Arrays.stream(dices).boxed().toArray(Integer[]::new);
        Set<Integer> dicesSet = new HashSet<Integer>(Arrays.asList(dicesInt));
        return scores = (dicesSet.equals(largestraight)) ? 20 : 0;
    }

    private int fullHouse(int[] dices) {
        List<Integer> elementsSum = diceElementsSum (dices);
        int isFullHouse = 0;
        int fullHouse_score = 0;
        for (int elementSum : elementsSum) {
            if (elementSum != 0) {
                isFullHouse += 1;
                fullHouse_score += elementSum;
            }
        }
        return scores = isFullHouse == 2 ? fullHouse_score : 0;
    }

    private static List<Integer> diceElementsSum (int[] dices){
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        for (int dice: dices){
            one = dice == 1 ? one += dice : one;
            two = dice == 2 ? two += dice : two;
            three = dice == 3 ? three += dice : three;
            four = dice == 4 ? four += dice : four;
            five = dice == 5 ? five += dice : five;
            six = dice == 6 ? six += dice : six;
        }
        List<Integer> elementsSum = new ArrayList<Integer>(Arrays.asList(one, two, three, four, five, six));
        return elementsSum;
    }


    public int getScores(Player player, String category, int[] dices) {
        switch (category) {
            case "REROLL":
            dices = rerolling(player, dices);
            System.out.println("\nThis go for " + player.name + ":     " + Arrays.toString(dices));
            category = getCategory();
            category = Goes.validName(category);
            category = Goes.validCategory(category, player.scoreMap);
            getScores(player, category, dices);
                break;
            case "chance":
                scores = chance(dices);
                break;
            case "yatzy":
                scores = yatzy(dices);
                break;
            case "ones":
                scores = ones(dices);
                break;
            case "twos":
                scores = twos(dices);
                break;
            case "threes":
                scores = threes(dices);
                break;
            case "fours":
                scores = fours(dices);
                break;
            case "fives":
                scores = fives(dices);
                break;
            case "sixes":
                scores = sixes(dices);
                break;
            case "pair":
                scores = pair(dices);
                break;
            case "twoPairs":
                scores = twoPairs(dices);
                break;
            case "threeOfAKind":
                scores = threeOfAKind(dices);
                break;
            case "fourOfAKind":
                scores = fourOfAKind(dices);
                break;
            case "smallStraight":
                scores = smallStraight(dices);
                break;
            case "largeStraight":
                scores = largeStraight(dices);
                break;
            case "fullHouse":
                scores = fullHouse(dices);
                break;
            default:
                break;
        }
        return scores;
    }

    private int[] rerolling(Player player, int[] dices) {
        int n;
        Boolean isRerolling = false;
        Random random = new Random();
        player.reroll_chances--;
        if (player.reroll_chances < 0) {
            System.out.println("You already had three times re-rolling.");

        } else {
            for (int i = 0; i < dices.length; i++){
                System.out.println("If you want to reroll '" + dices[i] + "' type 'true'. Otherwise, type 'false'.");
                while(!go.hasNextBoolean()){
                    System.out.println("Type 'true' or 'false'.");
                    go.next(); }
                isRerolling = go.nextBoolean();
                n = random.nextInt(6) + 1;
                dices[i] = (player.reroll_chances <= 3 && isRerolling == true) ? n : dices[i] ;
            }
        }
        category = "fail";
        setCategory(category);
        return dices;
    }
    private void setCategory(String category){
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
}

