package com.mortgagecalculator_v2.me;


import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float annualInterest = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.print("Enter a value between 1000 to 1000000 ");

        }

        while (true) {
            System.out.print(" Annual Interest Rate");
            annualInterest = scanner.nextFloat();
            if(annualInterest >= 1 && annualInterest <= 30) {
                float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter value between 1 and 30");
        }



    }

}