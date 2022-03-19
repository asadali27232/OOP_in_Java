package com.company;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Positive Integer");
        int n = input.nextInt();

        boolean primeFlag = true;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                if (i%j==0)
                    primeFlag = false;
            }
            if (primeFlag)
                System.out.println(i);
        }
    }
}
