package com.narae.practice.gameofyatzy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name1;
        String name2;
        Scanner player = new Scanner(System.in);
        System.out.println("Name of the player1: ");
        name1 =player.nextLine();
        System.out.println("Name of the player2: ");
        name2 =player.nextLine();
        // TODO - extend more players by adding a class
        Player player1 = new Player(name1);//int[] player1 = new int[5];
        Player player2 = new Player(name2);//int[] player2 = new int[5];
        Goes goes = new Goes(player1, player2);
    }
}

