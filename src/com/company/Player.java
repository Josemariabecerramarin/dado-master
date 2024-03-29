package com.company;

public class Player {
    private String name;
    private int wins;
    private int loses;

    public Player(String name) {
        this.name = name;
        wins = 0;
        loses = 0;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getWins() {

        return wins;
    }

    public void setWins(int wins) {

        this.wins = wins;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", points=" + wins +
                '}';
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }


}