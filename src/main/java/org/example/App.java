package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 16 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = in.nextInt();

        String out = (age >= 16)? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.print(out);
    }
}
