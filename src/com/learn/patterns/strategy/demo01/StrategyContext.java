package com.learn.patterns.strategy.demo01;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class StrategyContext {
    private IStrategy strategy;

    public StrategyContext(IStrategy IStrategy) {
        this.strategy = IStrategy;
    }

    public void algorithm() {
        strategy.AlgorithmInterface();
    }
}
