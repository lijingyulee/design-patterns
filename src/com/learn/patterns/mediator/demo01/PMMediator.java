package com.learn.patterns.mediator.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class PMMediator implements IMediator {

    Map<String, IColleague> colleagueMap;

    public PMMediator() {
        colleagueMap = new HashMap<>();
    }

    @Override
    public void register(String name, IColleague colleague) {
        colleagueMap.put(name, colleague);
    }

    @Override
    public void command(String msg, String name) {
        System.out.println(msg);
        IColleague colleague = colleagueMap.get(name);
        colleague.job();
    }

}
