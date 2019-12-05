package com.learn.patterns.memento.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class Chessman {
    private String label;
    private Integer x;
    private Integer y;

    public Chessman(String label, Integer x, Integer y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public ChessmanMemento getMemento() {
        return new ChessmanMemento(this.label,this.x,this.y);
    }

    public void restoreMemento(ChessmanMemento memento) {
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    @Override
    public String toString() {
        return "Chessman{" +
                "label='" + label + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
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
