package com.learn.patterns.responsibilitychain.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public abstract class Approver {
    /** 下一个处理者 */
    Approver approver;
    /** 名字 */
    String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 设置下一个审批者
     * @param approver
     */
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 具体处理由子类完成
     * @param purchaseRequest
     */
    protected abstract void processRequest(PurchaseRequest purchaseRequest);
}
