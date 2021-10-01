package com.bdlz.snakenladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int position = 0;
        int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println("The Starting Position of Player is : " + position);
        System.out.println("Player Roll the Dice and get DiceNumber : " + diceNumber);
    }
}
