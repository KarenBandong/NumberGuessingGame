package org.lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Phase 1 and 2
        Scanner keyboard= new Scanner(System.in);
        int numberNeeded, pickedNumber;
        String Username;




        System.out.println("Hello! Welcome to the Number Guessing Game. May I please have your name?");
        Username= keyboard.nextLine();
        System.out.println("Hi "+Username+", We may now start the game...");

        System.out.println("Pick a number from 1-100");
        pickedNumber= keyboard.nextInt();
        numberNeeded= (int)(Math.random()*100);
        while(pickedNumber != numberNeeded){
            if(pickedNumber > numberNeeded){
                System.out.println("Go down");
                System.out.println("Pick a number from 1-100");
                pickedNumber = keyboard.nextInt();
            }else{
                System.out.println("Go higher");
                System.out.println("Pick a number from 1-100");
                pickedNumber = keyboard.nextInt();
            }

        }
        System.out.println("Congratulation!");

    }
}
