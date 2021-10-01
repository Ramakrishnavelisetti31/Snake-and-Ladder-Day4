package com.bdlz.snakenladder;

public class SnakeAndLadder {
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;
    public static final int NO_PLAY = 3;
    public static void main(String[] args) {
        int position = 0;
            int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("DiceNumber is : " + diceNumber);

            int option = (int) (Math.floor(Math.random() * 10) % 3 + 1);
            switch (option) {
                case IS_LADDER:
                    System.out.println("Ladder for the Player");
                    position = position + diceNumber;
                    break;
                case IS_SNAKE:
                    System.out.println("Snake for the player");
                    position = position - diceNumber;
                    break;
                case NO_PLAY:
                    System.out.println("No Play for the Player");
                    position = position;
                    break;
            }
        System.out.println("Position is :" + position);
    }
}
