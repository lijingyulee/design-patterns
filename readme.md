# 设计模式

博客地址： https://segmentfault.com/blog/lijingyulee 

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

#### 总结

优点：

-  工厂类包含必要的判断逻辑，可以决定在什么时候创建哪一个产品类的实例，客户端可以免除直接创建产品对象的职责，而仅仅“消费”产品，简单工厂模式实现了对象创建和使用的分离 

-  客户端无须知道所创建的具体产品类的类名，只需要知道具体产品类所对应的参数即可，对于一些复杂的类名，通过简单工厂模式可以在一定程度减少使用者的记忆量 

缺点：
-  由于工厂类集中了所有产品的创建逻辑，职责过重，一旦不能正常工作，整个系统都要受到影响
- 引入新的工厂类，增加系统的复杂性
- 系统扩展困难，尤其是产品数量较多时，会造成工厂逻辑过于复杂，不利于扩展和维护
- 简单工厂模式由于使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构

适用场景：
- 产品数量较少时
- 客户端只知道需要传入的参数 ，不关心产品是如何创建出来时
  
## 工厂方法模式
工厂方法模式：定义一个用于创建对象的接口，但是让子类来决定到底创建哪一个实例。工厂方法模式让一个类的实例化延迟到其子类。
工厂方法模式，简单来说是来为了解决简单工厂模式所出现的一些缺点而进行的改进。比如当一个简单的工厂模式要生产一个汽车，奥迪汽车，宝马汽车，但是如果要新增一个奔驰汽车。那么就要修改源代码，也就是修改工厂的源代码！添加一个业务逻辑，显然不符合开闭原则，所以就有了工厂方法模式。提供一个抽象工厂方法模式，这样就可以避免新增的时候修改源代码，只要新建一个类来继承了工厂方法模式即可
#### 示例1
1. 汽车接口
```java
public interface ICar {
    void run();
}
```
2. 工厂接口
```java
public interface ICarFactory {
    ICar createCar();
}
```
3. 奥迪汽车
```java
public class Audi implements ICar {
    @Override
    public void run() {
        System.out.println("奥迪汽车在飞速行驶中...");
    }
}
```
4. 宝马汽车
```java
public class BMW implements ICar {
    @Override
    public void run() {
        System.out.println("宝马在飞速行驶中...");
    }
}
```
5. 奥迪工厂
```java
public class AudiFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new Audi();
    }
}
```
6. 宝马工厂
```java
public class BMWFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new BMW();
    }
}	
```
7. 测试类
```java
public class Demo1Test {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();
        ICar audi = audiFactory.createCar();
        audi.run();

        BMWFactory bmwFactory = new BMWFactory();
        ICar bmw = bmwFactory.createCar();
        bmw.run();

        /**
         * 奥迪汽车在飞速行驶中...
         * 宝马在飞速行驶中...
         */
    }
}
```
#### 总结
优点：
- 在工厂方法模式中，工厂方法用来创建客户所需要的产品，同时还向客户端隐藏了哪种具体产品类将被实例化这一细节，用户只需要关心所需要产品对应的工厂，无须关心创建细节，甚至无须知道具体产品类的类名。
- 基于工厂角色和产品角色的多态性设计是工厂方法的关键，他能够让工厂模式自主的创建产品对象，而如何创建这个对象的细节完全封装在工厂类。
- 使用工厂方法模式最大的优点就是你新加类的时候不用动源代码，只要写新的产品新的工厂来继承对应的类就行了。

缺点：
- 在添加新产品时，需要编写新的具体产品类，而且还要提供与之对应的具体工厂类，系统中类的个数将成对增加，在一定程度上增加了系统的复杂度，有更多的类需要编译和运行，会给系统带来一些额外的开销。

- 由于考虑到系统的可扩展性，需要引入抽象层，在客户端代码中均使用抽象层进行定义，增加了系统的抽象性和理解难度，且在实现时可能需要用到DOM、反射等技术，增加了系统的实现难度

适用场景：
1、客户端不知道它所需要的对象的类，在工厂方法模式中，客户端不需要具体产品类的类名，只需要知道所对应的工厂即可，具体产品对象由具体工厂类创建，可见具体产品类的类名在配置文件或者数据库中存在

2、抽象工厂类通过其子类来指定创建那个产品类，用父类来新建子类可以提高可扩展性

## 抽象工厂模式

抽象工厂模式为创建一组对象提供了一种解决方案。与工厂方法模式相比，抽象工厂模式中的具体工厂不只是创建一种产品，它负责创建一族产品。

在工厂方法模式中具体工厂负责生产具体的产品，每一个具体工厂对应一种具体产品，工厂方法具有唯一性，一般情况下，一个具体工厂中只有一个或者一组重载的工厂方法。但是有时候我们希望一个工厂可以提供多个产品对象，而不是单一的产品对象，如一个水果工厂，它可以生产苹果、香蕉等多种电器，而不是只生产某一种水果。

- 产品等级结构：产品等级结构即产品的继承结构，如一个抽象类是水果，其子类有苹果、香蕉，则抽象水果类与具体的水果之间构成了一个产品等级结构，抽象水果是父类，而具体水果(苹果、香蕉)是其子类。

- 产品族：在抽象工厂模式中，产品族是指由同一个工厂生产的，位于不同产品等级结构中的一组产品，如北方工程生产苹果、香蕉等，北方苹果位于苹果等级结构中，香蕉位于香蕉产品等级结构中，北方苹果、北方香蕉构成了一个产品族。

#### 示例1
- 抽象水果类
```java
public interface Fruit {
    void show();
}
```
- 抽象水果工厂类
```java
public interface FruitFactory {
    //实例化Apple
    public Fruit getApple();

    //实例化Banana
    public Fruit getBanana();
}
```

- 北方苹果类
```java
public class NorthApple implements Fruit {
    @Override
    public void show() {
        System.out.println("北方的苹果...");
    }
}
```
- 北方香蕉类
```
public class NorthBanana implements Fruit {
    @Override
    public void show() {
        System.out.println("北方的香蕉...");
    }
}
```
- 南方苹果类
```java
public class SouthApple implements Fruit {
    @Override
    public void show() {
        System.out.println("南方的苹果...");
    }
}
```
- 南方香蕉类
```java
public class SouthBanana implements Fruit {
    @Override
    public void show() {
        System.out.println("南方的香蕉...");
    }
}
```
- 北方工厂
```java
public class NorthFactory implements FruitFactory {
    @Override
    public NorthApple getApple() {
        return new NorthApple();
    }

    @Override
    public NorthBanana getBanana() {
        return new NorthBanana();
    }
}
```
- 南方工厂
 ```java
 public class SouthFactory implements FruitFactory {
    @Override
    public SouthApple getApple() {
        return new SouthApple();
    }

    @Override
    public SouthBanana getBanana() {
        return new SouthBanana();
    }
}
 ```
- 测试类
```java
public class Demo1Test {
    public static void main(String[] args) {
        SouthFactory southFactory = new SouthFactory();
        Fruit southApple = southFactory.getApple();
        southApple.show();
        Fruit southBanana = southFactory.getBanana();
        southBanana.show();

        NorthFactory northFactory = new NorthFactory();
        Fruit northApple = northFactory.getApple();
        northApple.show();
        Fruit northBanana = northFactory.getBanana();
        northBanana.show();

        /**
         * 南方的苹果...
         * 南方的香蕉...
         * 北方的苹果...
         * 北方的香蕉...
         */

    }
}
```

#### 总结
优点：
- 抽象工厂模式隔离了具体类的生成，更换一种具体的工厂比较容易
- 当一个产品族中的多个对象被设计成一起工作时，它能够保证客户端始终只使用同一个产品族中的对象
-  增加新的产品族很方便，无须修改已有系统，符合“开闭原则”

缺点：
如果需要增加新的产品，需要进行较大的改动

适用场景：
- 产品等级结构稳定，不会增加或者删除产品
- 系统中有多个产品族，且每次只使用一个产品族
- 需要一个产品族的产品一起工作

## 单例模式

#### 创建方式
- 饿汉式( 静态常量)
- 饿汉式（静态代码块）
- 懒汉式(线程不安全)
- 懒汉式(线程安全，同步方法)
- 懒汉式(线程安全，同步代码块)
- 双重检查
- 静态内部类
- 枚举

#### 饿汉式( 静态常量)
步骤：
1. 构造器私有化 (防止 new )
2. 类的内部创建对象
3. 向外暴露一个静态的公共方法(getInstance)

###### 示例1
- 单例对象：
```javapublic class Singleton01 {
    private Singleton01() {}

    private final static Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance() {
        return instance;
    }
}
```
- 测试类
```java
public class Type01Test {
    public static void main(String[] args) {
        Singleton01 instance = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        /**
         * true
         * instance.hashCode=1689843956
         * instance2.hashCode=1689843956
         */
    }
}
```
###### 总结
- 优点
这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
- 缺点
在类装载的时候就完成实例化，没有达到 Lazy Loading 的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费

综上所述，这种单例模式可用，但可能造成内存浪费

#### 饿汉式（静态代码块）
###### 示例1
- 单例对象：
public class Singleton02 {
    private Singleton02() {}

    private static Singleton02 instance;
    static {
        instance = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return instance;
    }
}
```
- 测试类
​```java
public class Type02Test {
    public static void main(String[] args) {
        Singleton02 instance = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        /**
         * true
         * instance.hashCode=1689843956
         * instance2.hashCode=1689843956
         */
    }
}
```
###### 总结
优缺点同第一种方式，可用，可能造成内存浪费

#### 懒汉式(线程不安全)

###### 示例1
- 单例对象
```java
public class Singleton03 {
    private Singleton03() {}

    private static Singleton03 instance;

    public static Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}
```

###### 总结
- 起到了 Lazy Loading 的效果，但是只能在单线程下使用，多线程可能会有多个实例
- 在实际开发中， 不要使用这种方式

#### 懒汉式(线程安全，同步方法)

###### 示例1
- 单例对象
```java
public class Singleton04 {
    private Singleton04() {}

    private static Singleton04 instance;

    public static synchronized Singleton04 getInstance() {
        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;

    }
}
```
- 总结
- 能够解决线程安全问题
- 上述代码虽然解决了线程安全问题，但是每次调用getInstance()时都需要进行线程锁定判断，在多线程高并发访问环境中，将会导致系统性能大大降低
- 在实际开发中， 不推荐使用这种方式

#### 懒汉式(同步代码块)

###### 示例1
```java
public class Singleton05 {
    private Singleton05() {}

    private static Singleton05 instance;

    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                instance = new Singleton05();
            }
        }
        return instance;
    }
}
```

###### 总结
假如在某一瞬间线程A和线程B都在调用getInstance()方法，此时instance对象为null值，均能通过instance == null的判断。由于实现了synchronized加锁机制，线程A进入synchronized锁定的代码中执行实例创建代码，线程B处于排队等待状态，必须等待线程A执行完毕后才可以进入synchronized锁定代码。但当A执行完毕时，线程B并不知道实例已经创建，将继续创建新的实例，导致产生多个单例对象，违背单例模式的设计思想，不推荐使用

#### 双重检查
###### 示例1
```java
public class Singleton06 {
    private Singleton06() {}

    private volatile static Singleton06 instance;

    public static Singleton06 getInstance() {
        if (instance == null) {
            synchronized (Singleton06.class) {
                if(instance == null) {
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}
```

###### 总结
- Double-Check 概念是多线程开发中常使用到的，如代码中所示，我们进行了两次 if (singleton == null)检查，能够保证线程安全
- 实例化代码只用执行一次，后面再次访问时，判断 if (singleton == null)，直接 return 实例化对象，也避免反复进行方法同步.
- 线程安全； 延迟加载； 效率较高
- 需要注意的是，如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile，被volatile修饰的成员变量可以确保多个线程都能够正确处理，且该代码只能在JDK 1.5及以上版本中才能正确执行。由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低，因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式

#### 静态内部类
###### 示例1
- 单例对象
```java
public class Singleton07 {
    private Singleton07() {}

    private static class InnerClass {
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    public static Singleton07 getInstance() {
        return InnerClass.INSTANCE;
    }

}
```
###### 总结
由于静态单例对象没有作为Singleton07的成员变量直接实例化，因此类加载时不会实例化Singleton07，第一次调用getInstance()时将加载内部类InnerClass，在该内部类中定义了一个static类型的变量INSTANCE，此时会首先初始化这个成员变量，由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次。由于getInstance()方法没有任何线程锁定，因此其性能不会造成任何影响。这样我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能。推荐使用
