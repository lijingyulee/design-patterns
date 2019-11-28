package com.learn.patterns.flyweight.demo01;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public abstract class IChessman {
    public abstract String getColor();

    public void display(Coordinate coord){
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY() );
    }
}
