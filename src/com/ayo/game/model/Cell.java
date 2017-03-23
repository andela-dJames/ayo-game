package com.ayo.game.model;

import java.util.Objects;

/**
 * Created by danijax on 3/19/17.
 */
public class Cell {

    private int cellId;

    private int noOfSeed;

    private int sectionId;

    public Cell(int cellId, int noOfSeed, int sectionId) {
        this.cellId = cellId;
        this.noOfSeed = noOfSeed;
        this.sectionId = sectionId;
    }

    public int getCellId() {
        return cellId;
    }

    public void setCellId(int cellId) {
        this.cellId = cellId;
    }

    public int getNoOfSeed() {
        return noOfSeed;
    }

    public void setNoOfSeed(int noOfSeed) {
        this.noOfSeed = noOfSeed;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public void addSeed(){
        noOfSeed ++;
    }

    public void removeSeed(){
        noOfSeed = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return cellId == cell.cellId &&
                noOfSeed == cell.noOfSeed &&
                sectionId == cell.sectionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cellId, noOfSeed, sectionId);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "cellId=" + cellId +
                ", noOfSeed=" + noOfSeed +
                ", sectionId=" + sectionId +
                '}';
    }
}
