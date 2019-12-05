package com.learn.patterns.memento.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class ChessmanMemento {
    private String label;
    private Integer x;
    private Integer y;

    public ChessmanMemento(String label, Integer x, Integer y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
