package com.ayo.game.model;

import java.util.List;

/**
 * Created by danijax on 3/19/17.
 */
public class Section {

    private int id;

    private int palyerId;

    private List<Cell> cellList;

    public int getPalyerId() {
        return palyerId;
    }

    public void setPalyerId(int palyerId) {
        this.palyerId = palyerId;
    }

    public List<Cell> getCellList() {
        return cellList;
    }

    public void setCellList(List<Cell> cellList) {
        this.cellList = cellList;
    }
}
