package com.narae.practice.gameofyatzy;

public class MyUnit {
    public String concatenate(String one, String two){

        String result = combineResults( one, two);

        return result;
    }

    private String combineResults(String one, String two) {
        String combination = "";

          combination += one;
System.out.println("TESTTESTTEST");
          combination +=two;


        return combination;
    }
}
