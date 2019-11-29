package com.learn.patterns.visitor.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public class AccountBook {
    private List<IBill> billList = new ArrayList<IBill>();
    //添加单子
    public void addBill(IBill bill){
        billList.add(bill);
    }
    //供账本的查看者查看账本
    public void show(IVisitor visitor){
        for (IBill bill : billList) {
            bill.accept(visitor);
        }
    }
}
