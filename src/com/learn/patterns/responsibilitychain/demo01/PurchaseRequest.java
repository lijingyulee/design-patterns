package com.learn.patterns.responsibilitychain.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class PurchaseRequest {
    /** 采购编号 */
    private Integer id;
    /** 采购目的 */
    private String purpose;
    /** 采购金额 */
    private Double amount;

    public PurchaseRequest(Integer id, String purpose, Double amount) {
        this.id = id;
        this.purpose = purpose;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
