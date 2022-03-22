package com.company;

import java.util.Scanner;

public class Robot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T;
        int N;
        int X;
        String S;

        System.out.println("Testing a Robot that how many unique point it visits.........!");
        System.out.print("Enter number of test case: ");
        T = input.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.print("Enter number of moves that robot will make (Integer): ");
            N = input.nextInt();
            System.out.print("Enter current position of the Robot (Integer): ");
            X = input.nextInt();
            input.nextLine();
            System.out.print("Enter Moves (i.e. RRLLR): ");
            S = input.nextLine();

            int[] position = new int[N + 1];
            position[0] = X;
            for (int j = 1; j <= S.length(); j++) {

                if (S.charAt(j - 1) == 'R') {
                    position[j] = position[j - 1] + 1;
                }
                if (S.charAt(j - 1) == 'L') {
                    position[j] = position[j - 1] - 1;
                }

            }
            int uPos = position.length;

            for (int l = 0; l < position.length; l++) {
                for (int m = l + 1; m < position.length; m++) {
                    if (position[l] == position[m]) {
                        --uPos;
                        break;
                    }
                }
            }
            System.out.println("Robot will cover " + (uPos > 0 ? uPos : 0) + " Unique Points.....!");
            for (int j = 0; j < position.length; j++) {
                System.out.print(position[j] + " --> ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
