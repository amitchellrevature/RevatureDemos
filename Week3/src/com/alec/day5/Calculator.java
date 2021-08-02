package com.alec.day5;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a tool:\n" +
                "1 - Basic Calculator\n" +
                "2 - EMI Calculator");
        option = scanner.nextInt();
        if (option == 1){
            calculate(scanner);
        } else { emi(scanner); };
    }

    private static void calculate(Scanner scanner){
        double num1, num2;
        int option;
        while(true) {
            System.out.println("Enter First Number");
            num1 = scanner.nextDouble();
            System.out.println("Enter Second Number");
            num2 = scanner.nextDouble();
            System.out.println("Select Option:\n" +
                    "1 - Add\n" +
                    "2 - Subtract\n" +
                    "3 - Multiply\n" +
                    "4 - Divide");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    num1 = num1 + num2;
                    break;
                case 2:
                    num1 = num1 - num2;
                    break;
                case 3:
                    num1 = num1 * num2;
                    break;
                case 4:
                    num1 = num1 / num2;
                    break;
            }
            System.out.println("Result: " + num1);
        }
    }

    private static void emi(Scanner scanner){
        double loan, roi, tenure;
        System.out.println("Enter Loan Amount");
        loan = scanner.nextDouble();
        System.out.println("Enter Monthly Rate of Interest");
        roi = scanner.nextDouble();
        System.out.println("Enter Tenure (In Months)");
        tenure = scanner.nextDouble();
        System.out.println("Result: " + (loan * roi + tenure * Math.pow(1 + roi, tenure) / Math.pow(1 + roi, tenure)));
    }



}
