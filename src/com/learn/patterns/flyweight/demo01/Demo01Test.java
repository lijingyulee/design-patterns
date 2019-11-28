package com.learn.patterns.flyweight.demo01;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class Demo01Test {
    public static void main(String[] args) {
        IChessman black1 = ChessmanFactory.getChessman("black");
        IChessman black2 = ChessmanFactory.getChessman("black");

        System.out.println(black1 == black2);

        black1.display(new Coordinate(1, 2));
        black2.display(new Coordinate(3, 4));

        /**
         * true
         * 棋子颜色：黑色，棋子位置：1，2
         * 棋子颜色：黑色，棋子位置：3，4
         */

    }
}
