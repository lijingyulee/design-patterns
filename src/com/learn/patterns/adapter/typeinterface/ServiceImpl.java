package com.learn.patterns.adapter.typeinterface;

/**
 * @author lijy
 * @date 2019-11-27
 * @description
 */
public class ServiceImpl {
    public void test(IService iService) {
        // 只需要用到method1
        iService.method1();
    }
}
