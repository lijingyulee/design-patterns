package com.learn.patterns.strategy.demo01;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class Strategy01Test {

    private static final String STRATEGY_A = "A";

    public static void main(String[] args) {

        // 模拟参数
        String paramA = "A";
        IStrategy algorithmA = getAlgorithm(paramA);
        new StrategyContext(algorithmA).algorithm();

        System.out.println("----------------------");

        String paramB = "B";
        IStrategy algorithmB = getAlgorithm(paramB);

        new StrategyContext(new AlgorithmB()).algorithm();

        /**
         * 实现算法A
         * ----------------------
         * 实现算法B
         */
    }

    private static IStrategy getAlgorithm(String param) {
        if (STRATEGY_A.equals(param)) {
            return new AlgorithmA();
        }
        return new AlgorithmB();
    }
}
