package com.ps;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean started = false;
        System.out.println("Welcome to Financial Calculator created by: Kenny Lin");
        System.out.println("What calculator do you want to use? (1 - Mortgage, 2 - Future Value, 3 - Present Value, 4 - Hourly->Yearly)");
        System.out.println("Please enter your choice:");
        int command = scanner.nextInt();
        if(command == 1 || command == 2 || command == 3 || command == 4) {
            started = true;
        }
        else
        {
            System.out.println("Try again, pleas enter a number or there was an error with input");
        }
        int count = 0;
        while(started)
        {
            if(count > 0)
            {
                System.out.println("What calculator do you want to use? (1 - Mortgage, 2 - Future Value, 3 - Present Value, 4 - Hourly->Yearly)");
                System.out.println("Please enter your choice:");
                command = scanner.nextInt();
            }
            //Mortgage Calculator 1
            if(command == 1)
            {
                System.out.println("Welcome to the Mortgage Calculator");
                System.out.println("Enter your Annual Interest Rate (ex: 7.625% = 0.07625):");
                double air = scanner.nextDouble();
                double mair = air/12;

                System.out.println("Enter your loan amount (Please enter loan amount):");
                double loan = scanner.nextDouble();

                System.out.println("Enter your loan length (in years):");
                double years = scanner.nextDouble();
                //gets number of months
                int months = (int)(12 * years);

                //does mortgage calculation MATH
                double topFormula = mair * Math.pow(1 + mair, months);
                double bottomFormula = Math.pow(1 + mair,months) -1;
                double monthlyPayment = loan * (topFormula/bottomFormula);
                monthlyPayment = Math.round(monthlyPayment * 100.0)/100.0;
                double totalInterest = (monthlyPayment * months) - loan;
                totalInterest = Math.round(totalInterest * 100.0)/100.0;

                //rounds and returns the mortgage and total intrest to user and displays it
                System.out.println("This is your monthly mortgage payment: $" + monthlyPayment + " and your total interest over " + years + " years is : $"+ totalInterest);
                System.out.println("Do you want to use our other calculators? (1 - Yes, 2 - No):");
                int userStart = scanner.nextInt();
                count++;
                if(userStart == 2)
                {
                    System.out.println("Thanks for using our calculator!");
                    break;
                }
            }
            //calculator 2 - Determine future value
            else if(command == 2)
            {
                //needs deposit,interest rate and # of years from user
                System.out.println("Welcome to the determining future value calculator!");
                System.out.println("Enter your deposit amount:");
                double deposit = scanner.nextDouble();

                System.out.println("Enter your interest rate in decimal form (ex. 1.75% = 0.0175):");
                double interestRate = scanner.nextDouble();

                System.out.println("Enter how many years:");
                double years = scanner.nextDouble();

                //math
                double futureVal = deposit * (Math.pow(1 + (interestRate/365),365 * years));
                futureVal = Math.round(futureVal * 100.0)/100.0;


                //displaying results, then asking if user wants to continue
                System.out.println("It will be worth $" + futureVal + " after "+ years + " years.");
                System.out.println("Do you want to use our other calculators? (1 - Yes, 2 - No):");
                int userStart = scanner.nextInt();
                count++;
                if(userStart == 2)
                    {
                        System.out.println("Thanks for using our calculator!");
                        break;
                    }
            }
            //calculator 3 - Determine present value
            else if(command == 3)
            {
                System.out.println("Welcome to present Value of an Ordinary Calculator");
                System.out.println("Please enter how much would you like to earn monthly:");
                double desiredMoney = scanner.nextDouble();

                System.out.println("Please enter the expected interest (ex. 2.5% = 0.025):");
                double interest = scanner.nextDouble();
                double monthlyInterest = interest/12;

                System.out.println("Please enter # of years to pay out:");
                double years = scanner.nextDouble();
                int months = (int)(12 * years);

                //The future value calculation
                double topCalc = 1 - Math.pow(1 + monthlyInterest, -months);
                double botCalc = monthlyInterest;
                double totalFunds = desiredMoney * (topCalc / botCalc);
                totalFunds = Math.round(totalFunds * 100.0)/100.0;

                //The amount you will need to invest
                System.out.println("You will need to invest: $" + totalFunds + " today in order to earn $" + desiredMoney + " monthly.");
                System.out.println("Do you want to use our other calculators? (1 - Yes, 2 - No):");
                int userStart = scanner.nextInt();
                count++;
                if(userStart == 2)
                {
                        System.out.println("Thanks for using our calculator!");
                        break;
                }
            }
            else if(command == 4)
            {
                System.out.println("Welcome to Hourly wage -> Yearly wage Calculator");
                System.out.println("Enter hourly wage:");
                double hrWage = scanner.nextDouble();

                System.out.println("Enter average work hours in a week:");
                int hours = scanner.nextInt();

                System.out.println("Do you work overtime? (1 - Yes, 2 - No)");
                int overTime = scanner.nextInt();
                int overTimeHrs = 0;
                double overTimeWage = 0;
                if(overTime == 1)
                {
                    System.out.println("Enter average overtime hours in a week, excluding normal total work hours:");
                    overTimeHrs = scanner.nextInt();
                    System.out.println("Enter overtime hourly pay:");
                    overTimeWage = scanner.nextDouble();
                }
                //math
                double yearlyWage = (52 * (hrWage * hours)) + (52 * (overTimeWage * overTimeHrs));
                yearlyWage = Math.round(yearlyWage * 100)/100;
                System.out.println("Your yearly salary is $"+ yearlyWage);
                System.out.println("Do you want to use our other calculators? (1 - Yes, 2 - No):");
                int userStart = scanner.nextInt();
                count++;
                if(userStart == 2)
                {
                    System.out.println("Thanks for using our calculator!");
                    break;
                }
            }
        }
    }
}
