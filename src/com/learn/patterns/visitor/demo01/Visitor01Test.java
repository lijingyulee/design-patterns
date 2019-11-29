package com.learn.patterns.visitor.demo01;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public class Visitor01Test {
    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();
        accountBook.addBill(new ConsumeBill("工资", 1000D));
        accountBook.addBill(new ConsumeBill("广告", 2000D));

        accountBook.addBill(new IncomeBill("销售额", 3000D));
        accountBook.addBill(new IncomeBill("卖广告位", 4000D));

        BossVisitor bossVisitor = new BossVisitor();
        CPAVisitor cpaVisitor = new CPAVisitor();

        accountBook.show(bossVisitor);
        bossVisitor.getInfo();
        accountBook.show(cpaVisitor);

        /**
         * 老板只关心总数，总收入:7000.000000,总支出：3000.000000
         * 注会查看账本时，如果单子的消费目的是发工资，则注会会查看有没有交个人所得税。
         * 注会查看账本时，只要是收入，注会都要查看公司交税了没。
         * 注会查看账本时，只要是收入，注会都要查看公司交税了没。
         */
    }
}
