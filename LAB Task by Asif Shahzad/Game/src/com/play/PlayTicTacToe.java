package com.play;

import java.util.Scanner;
import java.io.IOException;

import com.ENUM.BoxState;
import com.game.TicTacToe;

public class PlayTicTacToe {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            banner();
            System.out.println("Hi! Lets Start the Game....!");
            System.out.println();
            System.out.print("Enter Player-I's Name: ");
            String player1 = input.nextLine();
            System.out.println("Player-I: " + player1);
            System.out.println();
            System.out.print("Enter Player-II's Name: ");
            String player2 = input.nextLine();
            System.out.println("Player-II: " + player2);
            System.out.println();
            System.out.println("A Little Set of Rules:");
            System.out.printf("%2s  %s%n", "1.", "CROSS (X) Represents Player I");
            System.out.printf("%2s  %s%n", "2.", "CIRCLE (O) Represents Player II");
            System.out.printf("%2s  %s%n", "3.", "Enter Box Coordinates to Set Your Move i.e 2 3 or 1 1");
            System.out.printf("%6s  %s%n", " ", "- First Number Represents Row");
            System.out.printf("%6s  %s%n", " ", "- Second Number Represents Column");
            System.out.printf("%2s  %s%n", "4.", "Game Has Three States WIN, LOSS and DRAW");
            System.out.printf("%2s  %s%n", "5.", "Remember Box Coordinates to Play Efficiently");
            displayBoard();
            System.out.print("Press Enter to Play >> ");
            input.nextLine();
            System.out.println();
            banner();

            TicTacToe game = new TicTacToe(player1, player2);

            System.out.println("Player-I: " + game.getPlayer1() + " (X)");
            System.out.println("Player-II: " + game.getPlayer2() + " (O)");
            System.out.println();
            System.out.println("Let Player-I " + player1 + " start the game with his/her First Move...!");
            int i = 0;
            for (int turn = 0; turn < 9; turn++) {
                displayBoard(game.getGameBox());
                Integer row = 0;
                Integer col = 0;
//            getCoordinates(row, col, i, game.getPlayer1(), game.getPlayer2());
                System.out.println();
                System.out.println("Enter Coordinates of the Box to place your Move, until move made successful.");
                do {
                    if (turn % 2 == 0)
                        System.out.print("Player-I: ROW; 1-3 & COL; 1-3 : " + player1 + " (X) >> ");
                    else if (turn % 2 != 0)
                        System.out.print("Player-II: ROW; 1-3 & COL; 1-3 : " + player2 + " (O) >> ");
                    row = input.nextInt();
                    col = input.nextInt();
                    if ((row < 1 || row > 3) || (col < 1 || col > 3))
                        System.out.println("Oops. Move Unsuccessful, Wrong Coordinates. Try Again...!\n");
                    turn = game.start(row, col, turn);
                    if (turn == 10) {
                        banner();
                        displayBoard(game.getGameBox());
                        winMessage(game.getPlayer1(), game.getPlayer2(), i);
                    } else if (turn == 20) {
                        banner();
                        displayBoard(game.getGameBox());
                        drawMessage();
                    }
                } while ((row < 1 || row > 3) || (col < 1 || col > 3));

                clearConsole();
                ++i;

            }
            System.out.print("Press Enter to Play Again >> ");
            input.nextLine();
            input.nextLine();
        }
    }

    public static void banner() {
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("    Welcome to Tic Tac Toe by OO7-Developers    ");
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    public static void getCoordinates(Integer row, Integer col, int turn, String player1, String player2) {

    }

    public static void displayBoard() {
        System.out.println();

        System.out.println("    |-----------------------------|");
        System.out.println("    |         |         |         |");
        System.out.println("    |   1 1   |   1 2   |   1 3   |");
        System.out.println("    |         |         |         |");
        System.out.println("    |-----------------------------|");
        System.out.println("    |         |         |         |");
        System.out.println("    |   2 1   |   2 2   |   2 3   |");
        System.out.println("    |         |         |         |");
        System.out.println("    |-----------------------------|");
        System.out.println("    |         |         |         |");
        System.out.println("    |   3 1   |   3 2   |   3 3   |");
        System.out.println("    |         |         |         |");
        System.out.println("    |-----------------------------|");

        System.out.println();
    }

    public static void displayBoard(BoxState[][] gameBox) {
        System.out.println();

        System.out.println("        |-----------------------------|");
        System.out.println("        |         |         |         |");
        System.out.println("        |    " + (gameBox[0][0] == BoxState.EMPTY ? " " : gameBox[0][0]) + "    |    " + (gameBox[0][1] == BoxState.EMPTY ? " " : gameBox[0][1]) + "    |    " + (gameBox[0][2] == BoxState.EMPTY ? " " : gameBox[0][2]) + "    |");
        System.out.println("        |         |         |         |");
        System.out.println("        |-----------------------------|");
        System.out.println("        |         |         |         |");
        System.out.println("        |    " + (gameBox[1][0] == BoxState.EMPTY ? " " : gameBox[1][0]) + "    |    " + (gameBox[1][1] == BoxState.EMPTY ? " " : gameBox[1][1]) + "    |    " + (gameBox[1][2] == BoxState.EMPTY ? " " : gameBox[1][2]) + "    |");
        System.out.println("        |         |         |         |");
        System.out.println("        |-----------------------------|");
        System.out.println("        |         |         |         |");
        System.out.println("        |    " + (gameBox[2][0] == BoxState.EMPTY ? " " : gameBox[2][0]) + "    |    " + (gameBox[2][1] == BoxState.EMPTY ? " " : gameBox[2][1]) + "    |    " + (gameBox[2][2] == BoxState.EMPTY ? " " : gameBox[2][2]) + "    |");
        System.out.println("        |         |         |         |");
        System.out.println("        |-----------------------------|");

        System.out.println();
    }

    public static void clearConsole() {
        for (int i = 0; i < 80 * 300; i++) // Default Height of cmd is 300 and Default width is 80
            System.out.print("\b"); // Prints a backspace
    }

    public static void winMessage(String player1, String player2, int turn) {
        if (turn % 2 == 0) {
            System.out.println("------------------------------------------------");
            System.out.println("Player-I: " + player1 + " WINS");
            System.out.println("------------------------------------------------");
            System.out.println();
        } else if (turn % 2 != 0) {
            System.out.println("------------------------------------------------");
            System.out.println("Player-I: " + player2 + " WINS");
            System.out.println("------------------------------------------------");
            System.out.println();
        }
    }

    public static void drawMessage() {
        System.out.println("------------------------------------------------");
        System.out.println("                   Match Draws                  ");
        System.out.println("------------------------------------------------");
        System.out.println();
    }
}