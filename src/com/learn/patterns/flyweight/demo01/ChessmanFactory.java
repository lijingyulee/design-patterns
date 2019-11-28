package com.learn.patterns.flyweight.demo01;

import java.util.HashMap;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class ChessmanFactory {
    private static HashMap<String, IChessman> pool;

    static {
        pool = new HashMap<>();
        BlackChessman blackChessman = new BlackChessman();
        WriteChessman writeChessman = new WriteChessman();
        pool.put("black", blackChessman);
        pool.put("write", writeChessman);
    }

    public static IChessman getChessman(String color) {
        return pool.get(color);
    }
}
