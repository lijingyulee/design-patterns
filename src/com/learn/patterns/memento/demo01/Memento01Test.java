package com.learn.patterns.memento.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class Memento01Test {
    public static void main(String[] args) {
        Chessman chessman = new Chessman("车", 5, 6);
        System.out.println("chessman = " + chessman);
        ChessmanMemento memento = chessman.getMemento();
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        mementoCaretaker.setMemento(memento);

        chessman.setX(6);
        chessman.setY(8);
        System.out.println("chessman = " + chessman);

        chessman.restoreMemento(mementoCaretaker.getMemento());
        System.out.println("chessman = " + chessman);

        /**
         * chessman = Chessman{label='车', x=5, y=6}
         * chessman = Chessman{label='车', x=6, y=8}
         * chessman = Chessman{label='车', x=5, y=6}
         */


    }
}
