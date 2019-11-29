package com.learn.patterns.visitor.demo01;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public abstract class AbstractBill implements IBill {

    private String item;
    private Double amount;

    public AbstractBill(String item, Double amount) {
        this.item = item;
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
