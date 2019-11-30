package com.learn.patterns.observer.demo01;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public interface ISubject {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(String title);
}
