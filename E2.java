/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nick Cook
 */

import java.util.Scanner;



public class E2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String string = input.next();

        int count = 0;

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }

        System.out.println("Total number of characters: " + count);

    }
}