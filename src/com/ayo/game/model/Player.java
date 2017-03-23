package com.ayo.game.model;

/**
 * Created by danijax on 3/19/17.
 */
public class Player {

    private String name;

    private int id;

    private int point;

    private int noOfSeedInHand;

    private boolean playerTurn;

    private Section section;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getNoOfSeedInHand() {
        return noOfSeedInHand;
    }

    public void setNoOfSeedInHand(int noOfSeedInHand) {
        this.noOfSeedInHand = noOfSeedInHand;
    }

    public boolean isPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(boolean playerTurn) {
        this.playerTurn = playerTurn;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
