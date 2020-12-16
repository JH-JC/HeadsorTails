package com.company;

import java.util.Random;


public class Main {

    public void coinFlip() {

    }

    public static void coinFlipsTaken(){
        int flips = 2;
        Random randomSide = new Random();
        for(int i = 0; i <= 50; i++){
            int randomFlip = randomSide.nextInt(flips);
            if (randomFlip == 1) {
                System.out.println("Tails");
            } else {
                System.out.println("Heads");
            }




        }
    }

    public static void main(String[] args) {
	// write your code here
        coinFlipsTaken();
    }
}
