# 设计模式

## 设计模式原则

#### 设计模式的目的

1. 重用性

2. 可读性

3. 可扩展性

4. 可靠性

5. 高内聚、低耦合

#### 设计模式原则
###### 单一职责原则
> 一个类应该只负责一项职责，不要存在多于一个导致类变更的原因。如类 A 负责两个不同职责：职责 1，职责 2。当职责 1 需求变更，而改变 A 时，可能造成职责 2 执行错误，所以需要将类 A 的粒度分解为 A1，A2

###### 接口隔离
> 客户端不应该依赖它不需要的接口，即 一个类对另一个类的依赖应该建立在最小的接口上

###### 依赖倒转
> 高层模块不应该依赖低层模块，二者都应该依赖其抽象
> 抽象不应该依赖细节，细节应该依赖抽象
> 依赖倒转(倒置)的中心思想是面向接口编程
> 依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在 java 中，抽象指的是接口或抽象类，细节就是具体的实现类。使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成

###### 里氏替换
> 所有引用基类的地方必须透明的使用其子类的对象。定义明确的说，只要父类能出现的地方子类也可以出现，而且替换为子类不会产生任何错误或异常，但是反过来就不行，有子类出现的地方，父类未必就能适应。
> 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
> 里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可以通过聚合 ， 组合 ，依赖  来解决问题(抽取更通用的base基类)

###### 开闭原则
> 开闭原则（Open Closed Principle）是编程中 最基础、最重要的设计原则
> 一个软件实体如类，模块和函数应该对扩展开放( 对提供方)，对修改关闭( 对使用方)。用抽象构建框架，用实现扩展细节。
> 当软件需要变化时，尽量 通过扩展软件实体的行为来实现变化，而不是 通过修改已有的代码来实现变化。
> 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则

###### 迪米特法则
> 一个对象应该对其他对象保持最少的了解
> 类与类关系越密切，耦合度越大
> 迪米特法则(Demeter Principle)又叫 最少知道原则(只与直接的朋友通信)，即一个类对自己依赖的类知道的越少越好。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的 public 方法，不对外泄露任何信息
> 直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，组合，聚合等。其中，我们称出现成员变量， 方法参数， 方法返回值中的类为直接的朋友，而出现在局部变量中的类不是直接的朋友。也就是说，陌生的类最好不要以局部变量的形式出现在类的内部

###### 合成复用原则
> 原则是尽量使用合成/聚合的方式，而不是使用继承

###### 总结
> 把变化的代码抽取出来
> 针对接口编程，而不是针对实现编程
> 松耦合

## 设计模式分类

1. 创建型模式：单例模式、抽象工厂模式、原型模式、建造者模式、工厂模式。
2. 结构型模式：适配器模式、桥接模式、装饰模式、组合模式、外观模式、享元模式、代理模式。
3. 行为型模式：模版方法模式、命令模式、访问者模式 、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式（Interpreter 模式）、状态模式、策略模式、职责链模式(责任链模式)

## 简单工厂模式

![simple-factory](https://github.com/lijingyulee/design-patterns/blob/master/imgs/simpleFactory.png)

- Factory（工厂角色）：工厂角色即工厂类，它是简单工厂模式的核心，负责实现创建所有产品实例的内部逻辑；工厂类可以被外界直接调用，创建所需的产品对象；在工厂类中提供了静态的工厂方法factoryMethod()，它的返回类型为抽象产品类型Product

- Product（抽象产品角色）：它是工厂类所创建的所有对象的父类，封装了各种产品对象的公有方法，它的引入将提高系统的灵活性，使得在工厂类中只需定义一个通用的工厂方法，因为所有创建的具体产品对象都是其子类对象

- ConcreteProduct（具体产品角色）：它是简单工厂模式的创建目标，所有被创建的对象都充当这个角色的某个具体类的实例。每一个具体产品角色都继承了抽象产品角色，需要实现在抽象产品中声明的抽象方法

#### 示例1

1. 定义抽象类
```java
public abstract class AbstractCar {

    public void run() {
        System.out.println("汽车飞速行驶中...");
    }
}
```
2. 定义实现子类
```java
public class Audi extends AbstractCar {
    @Override
    public void run() {
        System.out.println("奥迪汽车飞速行驶中...");
    }
}
```

```java
public class BMW extends AbstractCar {

    @Override
    public void run() {
        System.out.println("宝马汽车飞速行驶中...");
    }
}
```

3. 定义工厂类
```java
public class CarFactory {

    private static final String CAR_TYPE_BMW = "bmw";
    private static final String CAR_TYPE_AUDI = "audi";

    public static AbstractCar getCar(String type) {
        if (CAR_TYPE_BMW.equals(type)) {
            return new BMW();
        } else if (CAR_TYPE_AUDI.equals(type)) {
            return new Audi();
        } else {
            // 默认返回宝马汽车,避免NPE
            return new BMW();
        }
    }

}
```
4. 测试类
```java
public class Demo1Test {
    public static void main(String[] args) {

        // 得到具体的汽车--宝马
        AbstractCar bwm = CarFactory.getCar("bwm");
        bwm.run();

        // 得到具体的汽车--奥迪
        AbstractCar audi = CarFactory.getCar("audi");
        audi.run();

        /*
            执行结果：
                宝马汽车飞速行驶中...
                奥迪汽车飞速行驶中...
         */

    }
}
```

#### 示例2

1. 定义接口
```java
public interface IOperation {
    double getResult(double a, double b);
}
```
2. 定义实现
```java
public class AddOperation implements IOperation {
    @Override
    public double getResult(double a, double b) {
        return a + b;
    }
}
```

```java
public class SubOperation implements IOperation {
    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}
```
3. 定义工厂类
```java
public class OperationFactory {
    private static final String OPERATION_TYPE_ADD = "add";
    private static final String OPERATION_TYPE_SUB = "sub";

    public static IOperation getOperation(String type) {
        switch (type) {
            case OPERATION_TYPE_ADD:
                return new AddOperation();
            case OPERATION_TYPE_SUB:
                return new SubOperation();
            default:
                return new AddOperation();
        }
    }
}
```
4. 定义测试类
```java
public class Demo2Test {
    public static void main(String[] args) {
        IOperation addOperation = OperationFactory.getOperation("add");
        double result1 = addOperation.getResult(1.0, 2.0);
        System.out.println("result1 = " + result1);

        IOperation subOperation = OperationFactory.getOperation("sub");
        double result2 = subOperation.getResult(10.0, 2.0);
        System.out.println("result2 = " + result2);

        /**
         * result1 = 3.0
         * result2 = 8.0
         */
    }
}
```
