package com.ocr.gaelle;

import java.util.Random;
import java.util.Scanner;

public class Main {

            public static Scanner answer=new Scanner(System.in);
            public static int userChoice;
            public static int choice;
            public static int x;

            /*
             * The method getUserChoice() returns the move that the user has played.
             *
             * The method should print out "Enter rock, paper, or scissors!" and then read in
             * one word from the user.
             *
             * Hint: Remember that to read input from the user we use the following two lines:
             *
             * Scanner scanner = new Scanner(System.in);
             * String input = scanner.next();
             */

            public static int getUserChoice() {
                System.out.println("Choose Rock(1) Paper(2) Scissors(3)");
                userChoice=answer.nextInt();
                return userChoice;
            }

            /*
             * The method getComputerChoice() returns one of "rock", "paper", or "scissors" at random.
             *
             * In order to get a random number, you can use the two Random lines that are already provided.
             *
             */
            private static int getComputerChoice() {
                Random rand = new Random();
                choice = rand.nextInt(3);
                return choice;
                // choice is now a variable that can be any number from 0 to 2 (0, 1, or 2), chosen randomly

            }

            /**
             * The computeWinner() method will accept as parameters the user's choice and the computer's choice.
             *
             * Each one is one of "rock", "paper", or "scissors". This method will then return either "Tie!",
             * "User Wins!", or "Computer Wins!", depending on who the winner is.
             */
            private static int computeWinner(int userChoice, int choice) {




                if(userChoice==1 && choice==2){
                    System.out.println("You choose Rock");
                    System.out.println("Computer choose Scissors");
                    x= 2;
                }

                if (userChoice==2 && choice==2){
                    System.out.println("You choose Paper");
                    System.out.println("Computer choose Scissors");
                    x= 2;
                }
                if (userChoice==3 && choice==1){
                    System.out.println("You choose Scissors");
                    System.out.println("Computer choose Paper");
                    x= 0;
                }
                if (userChoice==3 && choice==0){
                    System.out.println("You choose Scissors");
                    System.out.println("Computer choose Rock");
                    x= 2;
                }
                if (userChoice==2 && choice==0){
                    System.out.println("You choose Paper");
                    System.out.println("Computer choose Rock");
                    x= 0;
                }
                if (userChoice==1 && choice==1){
                    System.out.println("You choose Rock");
                    System.out.println("Computer choose Paper");
                    x= 0;
                }
                if (userChoice==1 && choice==0){
                    System.out.println("You choose Rock");
                    System.out.println("Computer choose Rock");
                    x= 1;
                }
                if (userChoice==2 && choice==1){
                    System.out.println("You choose Paper");
                    System.out.println("Computer choose Paper");
                    x= 1;
                }
                if (userChoice==3 && choice==2){
                    System.out.println("You choose Scissors");
                    System.out.println("Computer choose Scissors");
                    x= 1;
                }
            return x;
            }


            /*
             * Main method of the game. This should:
             *
             * 1. Welcome the user to the game: print something like "Welome to Rock Paper Scissor!"
             * 2. Ask the user to enter a move to play
             * 3. Get the random computer move, and print out who won
             * 4. Ask if the user wants to quit (the user can enter 'exit' to stop playing), and if not, play again
             * @param args
             */

            public static void main(String[] args) {
                getUserChoice();
                getComputerChoice();
                computeWinner(userChoice,choice);
                if (x==0)
                    System.out.println("You loose!");
                if (x==1)
                    System.out.println("Tie!");
                if (x==2)
                    System.out.println("You WIN!");


            }

            /*
             * This is a tester to make sure your individual methods are working properly.
             *
             * While you are working on this assignment, you can use this method to see if you are correctly
             * implementing the individual methods!
             */
}

