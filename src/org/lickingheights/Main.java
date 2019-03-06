package org.lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Phase 1 and 2
        int numberNeeded, pickedNumber;
        String Username;
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Hello! Welcome to the Number Guessing Game. May I please have your name?");
        Username= keyboard.nextLine();
        System.out.println("Hi "+Username+", We may now start the game...");
        numberNeeded= (int)(Math.random()*100);
        System.out.println("Pick a number from 1-100");
        pickedNumber= keyboard.nextInt();
    }
}
