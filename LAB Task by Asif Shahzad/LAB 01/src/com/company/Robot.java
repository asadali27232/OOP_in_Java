package com.company;

import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int T;
    int N;
    int X;
    String S;
    

    T = input.nextInt();
    for (int i = 0; i < T; i++) {
        N = input.nextInt();
        X = input.nextInt();
        input.nextLine();
        S = input.nextLine();

        int[] position = new int[N+1];
        position[0] = X;
        for (int j = 1; j <= S.length() ; j++) {

            if (S.charAt(j-1) == 'R') {
                position[j] = position[j-1] + 1;
            }
            if (S.charAt(j-1) == 'L') {
                position[j] = position[j-1] - 1;
            }
            
        }
        for (int j = 0; j < position.length; j++) {
            System.out.println(position[j]);
        }
        int uPos = position.length; 
        for (int l = 0; l < position.length; l++) {
            for (int m = l+1; m < position.length; m++) {
                if (position[l]==position[m]) {
                    --uPos;
                }
            }
        }
        System.out.print(uPos + " ");
    }
}
}
