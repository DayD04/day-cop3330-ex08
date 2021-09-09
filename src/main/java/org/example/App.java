package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "How many people? " );
        int people = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();

        System.out.print("how many slices per pizza? ");
        int slices = input.nextInt();
        int slicesTotal = pizzas * slices;

        int leftovers = 0;
        int slicePerPerson;

        System.out.println(people + " people with " + pizzas + " pizzas (" + slicesTotal + " slices).");
        if (slicesTotal % people != 0) {
            leftovers = slicesTotal % people;
        }
            slicePerPerson = slicesTotal / people;

        System.out.println("Each person gets " + slicePerPerson + " slices of pizza.");
        System.out.println("there are " + leftovers + " leftover pieces.");

    }
}
