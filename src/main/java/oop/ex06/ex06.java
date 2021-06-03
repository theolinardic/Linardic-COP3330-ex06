/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 06 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex06;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class ex06 {
    public static void main(String[] args)
    {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String userAge = userInputScanner.nextLine();
        System.out.print("At what age would you like to retire? ");
        String userRetireAge = userInputScanner.nextLine();

        int userAgeInt = Integer.parseInt(userAge);
        int userRetireAgeInt = Integer.parseInt(userRetireAge);
        int yearsUntilUserRetirement = userRetireAgeInt - userAgeInt;

        Date systemDate = new Date();
        // Adding 1900 because the getYear function returns the current year minus 1900. Adding 1900 restores it to the correct
        // year value.
        int currentYear = systemDate.getYear() + 1900;
        int userRetirementYear = currentYear + yearsUntilUserRetirement;

        // Challenge is below.
        if(yearsUntilUserRetirement < 0){
            System.out.println("You are already able to retire.");
        }
        else{
            System.out.println("You have " + yearsUntilUserRetirement + " years left until you can retire. \nIt's " + currentYear +
                    ", so you can retire in " + userRetirementYear + ".");
        }

    }
}
