package com.learn.patterns.factorymethod.demo1;

/**
 * @author lijy
 * @date 2019-11-25
 * @description
 */
public class BMWFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new BMW();
    }
}
