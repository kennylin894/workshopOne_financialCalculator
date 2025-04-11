package com.ps;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to Financial Calculator created by: Kenny Lin");
//        System.out.println("What calculator do you want to use? (1 - Mortgage, 2 - Future Value, 3 - Present Value)");
//        System.out.println("Please enter your choice:");
//        int command = scanner.nextInt();
//        //Mortgage Calculator
//        if(command == 1)
//        {
//            System.out.println("Welcome to the Mortgage Calculator");
//            System.out.println("Enter your Annual Interest Rate? (ex: 7.625% = 0.07625):");
//            double air = scanner.nextDouble();
//            double mair = air/12;
//            System.out.println("Enter your loan amount? (Please enter loan amount):");
//            double loan = scanner.nextDouble();
//            System.out.println("Enter how many years is your loan for:");
//            double years = scanner.nextDouble();
//            int months = (int)(12 * years);
//            //does mortgage calculation
//            double topFormula = mair * Math.pow(1 + mair, months);
//            double bottomFormula = Math.pow(1 + mair,months) -1;
//            double monthlyPayment = loan * (topFormula/bottomFormula);
//            monthlyPayment = Math.round(monthlyPayment * 100.0)/100.0;
//            //rounds and returns the mortgage to user
//            System.out.println("This is your monthly mortgage payment: $" + monthlyPayment);
//            System.out.println("Would you also like to know your total interest amount after " + years + " years? (1 - yes,2 - no)");
//            int input = scanner.nextInt();
//            if(input == 1)
//            {   double totalInterest = (monthlyPayment * months) - loan;
//                totalInterest = Math.round(totalInterest * 100.0)/100.0;
//                System.out.println("This is your total interest over" + years + " years is : $"+ totalInterest);
//                System.out.print("Thanks for using our calculator!");
//            }
//            else if(input == 2)
//            {
//                System.out.print("Okay, thanks for using our calculator!");
//            }
//            else
//            {
//                System.out.println("Try again, pleas enter a number or there was an error with input");
//            }
//        }
//        //calculator 2 - Determine future value
//        else if(command == 2)
//        {
//            //needs deposit,interest rate and # of years from user
//            System.out.println("Welcome to the determing future value calculator!");
//            System.out.println("Please enter your deposit amount");
//            double deposit = scanner.nextDouble();
//            System.out.println("Please enter your interest rate in decimal form. (ex. 1.75% = 0.0175)");
//            double interestRate = scanner.nextDouble();
//            System.out.println("Please enter how many years");
//            double years = scanner.nextDouble();
//            double futureVal = deposit * (Math.pow(1 + (interestRate/365),365 * years));
//            futureVal = Math.round(futureVal * 100.0)/100.0;
//            System.out.println("It will be worth " + futureVal + "$ after "+ years + ".");
//            System.out.print("Thanks for using our calculator!");
//        }
//        //calculator 3 - Determine present value
//        else if(command == 3)
//        {
//            System.out.println("Welcome to Present Value of an Ordinary Calculator");
//            System.out.println("Please enter how much would you like to earn monthly:");
//            double desiredMoney = scanner.nextDouble();
//            System.out.println("Please enter the expected interest (ex. 2.5% = 0.025):");
//            double interest = scanner.nextDouble();
//            double monthlyInterest = interest/12;
//            System.out.println("Please enter # of years to pay out:");
//            double years = scanner.nextDouble();
//            int months = (int)(12 * years);
//            //The calculation
//            double topCalc = 1 - Math.pow(1 + monthlyInterest, -months);
//            double botCalc = monthlyInterest;
//            double totalFunds = desiredMoney * (topCalc / botCalc);
//            totalFunds = Math.round(totalFunds * 100.0)/100.0;
//            //The amount you will need to invest
//            System.out.println("You will need to invest: $" + totalFunds + " today in order to earn " + desiredMoney + " monthly.");
//            System.out.print("Thanks for using our calculator!");
//        }
//        else
//        {
//            System.out.println("Try again, pleas enter a number or there was an error with input");
//        }

        System.out.println("Do you want to get started? (1 - Yes, 2 - No):");
        Boolean started = false;
        int userStart = scanner.nextInt();
        if(userStart == 1)
        {
            started = true;
        }
        else
        {
            System.out.println("Okay, bye!");
        }
        while(started = true)
        {
            System.out.println("Hey im working");
            System.out.println("Do you want to use the other calculators? (1 - Yes, 2 - No):");
            userStart = scanner.nextInt();
            if(userStart == 1)
            {
                started = true;
            }
            else
            {
                System.out.println("Okay, bye!");
            }
        }
    }

}
