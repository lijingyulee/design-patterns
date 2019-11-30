package com.learn.patterns.observer.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class WechatServer implements ISubject {

    private List<IObserver> observerList;

    public WechatServer() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String title) {
        observerList.forEach(observer -> observer.update(title));
    }

    public void publish(String title) {
        System.out.println("公众号发布了《" + title + "》");
        notifyObservers(title);
    }
}
