package com.learn.patterns.responsibilitychain.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class Demo01Test {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, "采购电脑", 15000.0);

        DepartmentApprover departmentApprover = new DepartmentApprover("教学主任");
        CollegeApprover collegeApprover = new CollegeApprover("学院院长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);

        /**
         * 采购项目 采购电脑 被 校长 处理
         */
    }
}
