package com.learn.patterns.responsibilitychain.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    protected void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() > 5000
                && purchaseRequest.getAmount() <= 10000) {
            System.out.println(" 采购项目 " + purchaseRequest.getPurpose() + " 被 " + this.name + " 处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
