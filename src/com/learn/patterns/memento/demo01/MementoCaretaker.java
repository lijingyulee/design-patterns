package com.learn.patterns.memento.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class MementoCaretaker {
    private ChessmanMemento memento;

    public ChessmanMemento getMemento() {
        return memento;
    }

    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }
}
