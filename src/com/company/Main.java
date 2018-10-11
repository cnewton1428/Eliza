package com.company;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
	// Simple Eliza
        //If unwell
        if (bad.equalsIgnoreCase("enter1"))

        System.out.println("Good Day. What is your problem? Enter your response here or Q to quit!");
        String enter1 = input.nextLine();

        System.out.println("I'm sorry to hear that! Let's see. What do you think will make it better?");
        String enter2 = input.nextLine();

        System.out.println("Perhaps you could try that! It would also help to look up ways to relax");
        String enter3 = input.nextLine();

        System.out.println("All the very best! I hope you feel much better tomorrow");
    }

    //If well
    public static String getHappier (String enter1){
        System.out.println("Good Day! What is your problem? Enter your response or enter Q to quit");
        String post = input.nextLine();
    }
}
