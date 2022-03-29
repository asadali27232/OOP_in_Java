package com.game;

import com.ENUM.BoxState;

public class TicTacToe extends Game {
    private BoxState[][] gameBox;

    public TicTacToe(String player1, String player2) {
        super(player1, player2);
        gameBox = new BoxState[3][3];

        for (int i = 0; i < gameBox.length; i++) {
            for (int j = 0; j < gameBox[i].length; j++) {
                setGameBox(i, j, BoxState.EMPTY);
            }
        }
    }

    public BoxState[][] getGameBox() {
        return gameBox;
    }

    public BoxState getGameBox(int X, int Y) {
        return gameBox[X][Y];
    }

    public void setGameBox(BoxState[][] gameBox) {
        this.gameBox = gameBox;
    }

    public void setGameBox(int X, int Y, BoxState gameBox) {
        this.gameBox[X][Y] = gameBox;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int start(int row, int col, int turn) {
        --row;
        --col;
        if ((row < 0 || row > 2) || (col < 0 || col > 2))
            return turn;
        else if (gameBox[row][col] == BoxState.EMPTY) {
            if (turn % 2 == 0) {
                this.setGameBox(row, col, BoxState.X);
            } else if (turn % 2 != 0) {
                this.setGameBox(row, col, BoxState.O);
            }
            if (turn % 2 == 0)
                System.out.println("Player-I (X): Move made Successfully...!");
            else if (turn % 2 != 0)
                System.out.println("Player-II (O): Move made Successfully...!");
            turn = gameStatus(turn);
            return turn;
        } else {
            System.out.println("Oops. Move Unsuccessful, Entered Box is Already Filled. Same Player's Turn Again...!");
            return --turn;
        }
    }

    public int gameStatus(int turn) {
        boolean isWin = false;
        boolean isDraw = false;
        int emptyCounter = 0;
        for (int row = 0; row < 3; row++) {
            int xCounter = 0;
            int oCounter = 0;

            for (int col = 0; col < 3; col++) {
                if (gameBox[row][col] == BoxState.X) {
                    xCounter++;
                } else if (gameBox[row][col] == BoxState.O) {
                    oCounter++;
                } else if (gameBox[row][col] == BoxState.EMPTY) {
                    emptyCounter++;
                }

            }
            if (oCounter == 3) {
                isWin = true;
                return 10;
            } else if (xCounter == 3) {
                isWin = true;
                return 10;
            }
        }
        for (int col = 0; col < 3; col++) {
            int xCounter = 0;
            int oCounter = 0;

            for (int row = 0; row < 3; row++) {
                if (gameBox[row][col] == BoxState.X) {
                    xCounter++;
                } else if (gameBox[row][col] == BoxState.O) {
                    oCounter++;
                }
                if (oCounter == 3) {
                    isWin = true;
                    return 10;
                } else if (xCounter == 3) {
                    isWin = true;
                    return 10;
                }
            }
        }
        int xCounter = 0;
        int oCounter = 0;
        for (int i = 0; i < 3; i++) {
            if (gameBox[i][i] == BoxState.X) {
                xCounter++;
            } else if (gameBox[i][i] == BoxState.O) {
                oCounter++;
            }
        }
        if (oCounter == 3) {
            isWin = true;
            return 10;
        } else if (xCounter == 3) {
            isWin = true;
            return 10;
        }
        xCounter = 0;
        oCounter = 0;
        for (int i = 0; i < 3; i++) {
            if (gameBox[2 - i][i] == BoxState.X) {
                xCounter++;
            } else if (gameBox[2 - i][i] == BoxState.O) {
                oCounter++;
            }
        }
        if (oCounter == 3) {
            isWin = true;
            return 10;
        } else if (xCounter == 3) {
            isWin = true;
            return 10;
        }
        if (emptyCounter == 0) {
            isDraw = true;
            return 20;

        }
        return turn;
    }
}