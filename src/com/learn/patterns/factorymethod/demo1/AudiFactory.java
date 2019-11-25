package com.learn.patterns.factorymethod.demo1;

/**
 * @author lijy
 * @date 2019-11-25
 * @description
 */
public class AudiFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new Audi();
    }
}
