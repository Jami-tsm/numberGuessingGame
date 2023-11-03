/*
Name: Jameson Baker
Date: 11.01.23
Description: Game where user inputs number, gets checked against
random number between 0-20, if user guesses correctly game ends, if
not next turn begins
*/

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int userGuess;
        Random rand= new Random();
        Scanner s = new Scanner(System.in);
        int goalNum = rand.nextInt(21);
        int turnsLeft = 10;
        boolean gameWon = false;

        System.out.println("Guess a number between 0-20: ");
        userGuess = s.nextInt();
        while (20 < userGuess || userGuess < 0){ 
            System.out.println("Guess a number between 0-20: ");
            userGuess = s.nextInt();
        }

        while (turnsLeft > 0 && !gameWon){
            if (userGuess == goalNum){
                System.out.println("Congrats, you guessed it in " + (10 -  turnsLeft) + " turns!");
                gameWon = true;
            }
            else {
                System.out.println("Turns left: " + turnsLeft);
                if (userGuess > goalNum){
                    System.out.println("Too high, guess again:");
                }
                else{
                    System.out.println("Too low, guess again:");
                }
                userGuess = s.nextInt();
                turnsLeft --;
            }
        }

    }
}