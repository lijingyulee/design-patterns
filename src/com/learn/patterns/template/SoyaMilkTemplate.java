package com.learn.patterns.template;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public abstract class SoyaMilkTemplate {
    //选材料
    void select() {
        System.out.println("选择好的新鲜黄豆");
    }

    //添加不同的配料， 抽象方法, 子类具体实现
    abstract void addCondiments();

    //浸泡
    void soak() {
        System.out.println("材料开始浸泡");
    }

    void beat() {
        System.out.println("材料放到豆浆机去打碎");
    }

    // 在模板方法模式的 父类中，我们可以 定义一个方法，它 默认不做任何事，子类可以视情况要不要覆盖它，该方法称为“钩子”
    //钩子方法，决定是否需要添加配料
    boolean customerWantCondiments() {
        return true;
    }

    //模板方法可以做成final,不让子类去覆盖
    final void make() {
        select();
        if(customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();

    }

}
