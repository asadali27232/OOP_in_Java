package com.game;

public abstract class Game {
    private String player1;
    private String player2;

    protected Game() {
        setPlayer1(null);
        setPlayer2(null);
    }

    protected Game(String player1, String player2) {
        setPlayer1(player1);
        setPlayer2(player2);
    }

    public String getPlayer1() {
        return player1;
    }

    protected void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    protected void setPlayer2(String player2) {
        this.player2 = player2;
    }

    @Override
    public String toString() {
        return "\n" +
                "Player 1 Name: " + getPlayer1() + "\n" +
                "Player 2 Name: " + getPlayer2() + "\n";
    }

    protected void start() {

    }

    protected void stop() {

    }

    protected void restart() {

    }
}