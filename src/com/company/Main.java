package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // color guessing game
        // create a random number between 1 and 10
        // ask user to guess the number
        // tell user if they are too high or too low
        // tell user if they are correct
        // repeat until user is correct
        // print out the number of guesses it took them
        //write the code
        int randomNumber = (int) (Math.random() * 10) + 1;
        System.out.println("Guess a number between 1 and 10");
        int guess = getInput("Enter your guess: ");
        int guessCount = 1;
        while (guess != randomNumber) {
            if (guess < randomNumber) {
                System.out.println("Too low, guess again");
            } else {
                System.out.println("Too high, guess again");
            }
            guess = getInput("Enter your guess: ");
            guessCount++;
        }
        System.out.println("You got it! It took you " + guessCount + " guesses");
    }
    private static int getInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

}

