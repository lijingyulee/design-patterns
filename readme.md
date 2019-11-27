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
```java
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

```java
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

#### 枚举

###### 示例1
- 单例对象
```java
public enum Singleton08 {
    INSTANCE;

    public void method() {
        System.out.println("枚举单例方法");
    }
}
```
- 测试类
```java
public class Type08Test {
    public static void main(String[] args) {
        Singleton08 instance = Singleton08.INSTANCE;
        Singleton08 instance2 = Singleton08.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        instance.method();

        /**
         * true
         * instance.hashCode=1689843956
         * instance2.hashCode=1689843956
         * 枚举单例方法
         */
    }
}
```

###### 总结
- 借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
- 这种方式是 Effective Java  作者 Josh Bloch  提倡的方式。 推荐使用 

#### 原型模式

原型模式(Prototype  Pattern)：使用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。原型模式是一种对象创建型模式。
需要注意的是通过克隆方法所创建的对象是全新的对象，它们在内存中拥有新的地址，通常对克隆所产生的对象进行修改对原型对象不会造成任何影响，每一个克隆对象都是相互独立的。通过不同的方式修改可以得到一系列相似但不完全相同的对象。
Java 中 Object 类是所有类的根类，Object 类提供了一个 clone()方法，该方法可以将一个 Java 对象复制一份，但是需要实现 clone的Java类必须要实现一个接口Cloneable，该接口表示该类能够复制且具有复制的能力 =>原型模式

###### 示例1
- 羊实体类
```java
public class Sheep implements Cloneable{
    private String name;
    private Integer age;
    private Sheep friend;

    public Sheep(String name, Integer age, Sheep friend) {
        this.name = name;
        this.age = age;
        this.friend = friend;
    }

    public Sheep(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```
- 测试类
```java
public class Demo01Test {
    public static void main(String[] args) {
        Sheep tomSheep = new Sheep("Tom", 18);
        Sheep jamesSheep = new Sheep("James", 22);
        tomSheep.setFriend(jamesSheep);

        try {
            Sheep cloneSheep = (Sheep) tomSheep.clone();
            System.out.println(tomSheep == cloneSheep);
            System.out.println(tomSheep.getFriend() == cloneSheep.getFriend());
            /**
             * false
             * true
             */
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```

###### 浅拷贝
- 对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象。
- 对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值（内存地址）复制一份给新的对象。因为实际上两个对象的该成员变量都指向同一个实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值
- 前面我们克隆羊就是浅拷贝
- 浅拷贝是使用默认的 clone()方法来实现

###### 深拷贝
- 复制对象的所有基本数据类型的成员变量值
- 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象。也就是说， 对象进行深拷贝要对整个对象( 包括对象的引用类型) 进行拷贝
- 深拷贝实现方式 1：重写 clone 方法来实现深拷贝
- 深拷贝实现方式 2：通过 对象序列化实现深拷贝(推荐)

###### 第一种深拷贝方式
- 猴子类
```java
public class Monkey implements Cloneable{
    private String name;
    private Integer age;
    private Monkey friend;

    public Monkey(String name, Integer age, Monkey friend) {
        this.name = name;
        this.age = age;
        this.friend = friend;
    }

    public Monkey(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Monkey getFriend() {
        return friend;
    }

    public void setFriend(Monkey friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 基本类型等
        deep = super.clone();
        //引用类型的属性单独处理
        Monkey monkey = (Monkey)deep;
        if (friend != null) {
            monkey.friend = (Monkey) friend.clone();
        }
        return monkey;
    }
}
```
- 测试类
```java
public class demo02Test {
    public static void main(String[] args) {
        Monkey tomMonkey = new Monkey("Tom", 18);
        Monkey jamesMonkey = new Monkey("James", 22);
        tomMonkey.setFriend(jamesMonkey);

        try {
            Monkey cloneMonkey = (Monkey) tomMonkey.clone();
            System.out.println(tomMonkey == cloneMonkey);
            System.out.println(tomMonkey.getFriend() == cloneMonkey.getFriend());
            System.out.println(tomMonkey);
            System.out.println(cloneMonkey);
            System.out.println(tomMonkey.getFriend());
            System.out.println(cloneMonkey.getFriend());

            /**
             * false
             * false
             * Monkey{name='Tom', age=18, friend=Monkey{name='James', age=22, friend=null}}
             * Monkey{name='Tom', age=18, friend=Monkey{name='James', age=22, friend=null}}
             * Monkey{name='James', age=22, friend=null}
             * Monkey{name='James', age=22, friend=null}
             */
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```

###### 深拷贝第二种方式
- 仍以猴子为例
```
public class Monkey implements Serializable {
    private String name;
    private Integer age;
    private Monkey friend;

    public Monkey(String name, Integer age, Monkey friend) {
        this.name = name;
        this.age = age;
        this.friend = friend;
    }

    public Monkey(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Monkey getFriend() {
        return friend;
    }

    public void setFriend(Monkey friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }

    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
        //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出
        //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Monkey monkey = (Monkey) ois.readObject();
            return monkey;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
        //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

}
```
- 测试类
```java
public class Demo03Test {
    public static void main(String[] args) {
        Monkey tomMonkey = new Monkey("Tom", 18);
        Monkey jamesMonkey = new Monkey("Jack", 22);
        tomMonkey.setFriend(jamesMonkey);

        Monkey cloneMonkey = (Monkey) tomMonkey.deepClone();
        System.out.println(tomMonkey == cloneMonkey);
        System.out.println(tomMonkey.getFriend() == cloneMonkey.getFriend());
        System.out.println(tomMonkey);
        System.out.println(cloneMonkey);
        System.out.println(tomMonkey.getFriend());
        System.out.println(cloneMonkey.getFriend());

        /**
         * false
         * false
         * Monkey{name='Tom', age=18, friend=Monkey{name='Jack', age=22, friend=null}}
         * Monkey{name='Tom', age=18, friend=Monkey{name='Jack', age=22, friend=null}}
         * Monkey{name='Jack', age=22, friend=null}
         * Monkey{name='Jack', age=22, friend=null}
         */

    }
}

```

###### 总结
- 优点
1. 创建新的对象比较复杂时，可以利用原型模式简化 对象的创建过程，同时也能够提高效率
2. 不用重新初始化对象，而是 动态地获得对象运行时的状态
3. 可以使用深克隆的方式保存对象的状态，使用原型模式将对象复制一份并将其状态保存起来，以便在需要的时候使用（如恢复到某一历史状态），可辅助实现撤销操作
- 缺点
1. 在实现深克隆的时候可能需要比较复杂的代码
2. 需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，但对已有的类进行改造时，需要修改其源代码，违背了 ocp 原则
- 适用场景
1. 创建新对象成本较大（如初始化需要占用较长的时间，占用太多的CPU资源或网络资源），新的对象可以通过原型模式对已有对象进行复制来获得，如果是相似对象，则可以对其成员变量稍作修改
2. 一个对象需要提供给其他对象访问,而且各个调用者可能需要修改其值,可以考虑使用原型模式拷贝多个对象供调用者使用,即保护性拷贝

#### 建造者模式
建造者模式(Builder Pattern)：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。建造者模式是一种对象创建型模式。

![builder](D:\develop\workspace\design-patterns\imgs\builder.png)

- Builder（抽象建造者）：它为创建一个产品Product对象的各个部件指定抽象接口，在该接口中一般声明两类方法，一类方法是buildPartX()，它们用于创建复杂对象的各个部件；另一类方法是getResult()，它们用于返回复杂对象。Builder既可以是抽象类，也可以是接口。
- ConcreteBuilder（具体建造者）：它实现了Builder接口，实现各个部件的具体构造和装配方法，定义并明确它所创建的复杂对象，也可以提供一个方法返回创建好的复杂产品对象。
- Product（产品角色）：它是被构建的复杂对象，包含多个组成部件，具体建造者创建该产品的内部表示并定义它的装配过程。
- Director（指挥者）：指挥者又称为导演类，它负责安排复杂对象的建造次序，指挥者与抽象建造者之间存在关联关系，可以在其construct()建造方法中调用建造者对象的部件构造与装配方法，完成复杂对象的建造。客户端一般只需要与指挥者进行交互，在客户端确定具体建造者的类型，并实例化具体建造者对象（也可以通过配置文件和反射机制），然后通过指挥者类的构造函数或者Setter方法将该对象传入指挥者类中

###### 示例1

- 产品(House)

```java
public class House {
    private String base;
    private String wall;
    private String ceiling;
    public String getBase() {
        return base;
    }
    public void setBase(String base) {
        this.base = base;
    }
    public String getWall() {
        return wall;
    }
    public void setWall(String wall) {
        this.wall = wall;
    }
    public String getCeiling() {
        return ceiling;
    }
    public void setCeiling(String ceiling) {
        this.ceiling = ceiling;
    }
}
```
- builder抽象

```java
public abstract class Builder {
    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBase();
    public abstract void buildWalls();
    public abstract void buildCelling();

    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }
}
```

- 普通房子builder

```java
public class CommonHouseBuilder extends Builder {
    @Override
    public void buildBase() {
        System.out.println("普通房子打地基...");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙...");
    }

    @Override
    public void buildCelling() {
        System.out.println("普通房子修天花板...");
    }
}

```

- 高楼builder

```java
public class HighHouseBuilder extends Builder {
    @Override
    public void buildBase() {
        System.out.println("高楼打地基...");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙...");
    }

    @Override
    public void buildCelling() {
        System.out.println("高楼修天花板...");
    }
}

```

- 指挥者

```java
public class Director {
    private Builder build = null;

    //构造器传入
    public Director(Builder build) {
        this.build = build;
    }

    //通过setter传入
    public void setHouseBuilder(Builder build) {
        this.build = build;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        build.buildBase();
        build.buildWalls();
        build.buildCelling();
        return build.buildHouse();
    }
}

```

- 测试类

```java
public class Demo01Test {
    public static void main(String[] args) {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        Director director = new Director(commonHouseBuilder);
        director.constructHouse();
        System.out.println("=====================================");
        director.setHouseBuilder(new HighHouseBuilder());
        director.constructHouse();

        /**
         * 普通房子打地基...
         * 普通房子砌墙...
         * 普通房子修天花板...
         * =====================================
         * 高楼打地基...
         * 高楼砌墙...
         * 高楼修天花板...
         */

    }
}
```

###### 总结
- 优点
1. 在建造者模式中，客户端不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象
2. 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的具体建造者，用户使用不同的具体建造者即可得到不同的产品对象。由于指挥者类针对抽象建造者编程，增加新的具体建造者无须修改原有类库的代码，系统扩展方便，符合“开闭原则”
3. 可以更加精细地控制产品的创建过程。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制创建过程

- 缺点
1. 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，例如很多组成部分都不相同，不适合使用建造者模式，因此其使用范围受到一定的限制
2. 如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大，增加系统的理解难度和运行成本

- 适用场景

1. 需要生成的产品对象有复杂的内部结构，这些产品对象通常包含多个成员属性

2. 需要生成的产品对象的属性相互依赖，需要指定其生成顺序

3. 对象的创建过程独立于创建该对象的类。在建造者模式中通过引入了指挥者类，将创建过程封装在指挥者类中，而不在建造者类和客户类中

4. 隔离复杂对象的创建和使用，并使得相同的创建过程可以创建不同的产品
- 应用场景
1. 去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。
19元每周三 汉堡+可乐+薯条=套餐可能会发生改变。
2. JAVA 中的 StringBuilder 数组（单个字符）字整合在一起 字符串



#### 适配器模式

适配器模式(Adapter Pattern)：将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。

适配器模式分为类适配器模式、对象适配器模式、接口适配器模式。

- 将一个类的接口转换成另一种接口.让原本接口不兼容的类可以兼容
- 从用户的角度看不到被适配者，是解耦的
- 用户调用适配器转化出来的目标接口方法，适配器再调用被适配者的相关接口方法
- 用户收到反馈结果，感觉只是和目标接口交互

###### 类适配器模式
> 以手机充电为例说明。手机充电只能使用5V电压，生活用电是220V电压，需要一个适配器，将220V电压转化成5V电压，实际调用的还是220V

- 电压接口
```java
public interface IVoltage5V {
    void output5V();
}
```

- 被适配类
```java
public class Voltage220V {
    public void output220V() {
        System.out.println("调用220V...");
    }
}
```

- 适配类

```java
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    private String voltage;

    public VoltageAdapter(String voltage) {
        this.voltage = voltage;
    }

    @Override
    public void output5V() {
        // 可扩展方法output220V，而不修改output220V的源码
        System.out.println("调用5V...");
        if ("220".equals(voltage)) {
            output220V();
        }
    }
}
```

- 手机类

```java
public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        // 手机充电只能使用5V电压
        iVoltage5V.output5V();
    }
}
```

- 测试类

```java
public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        // 手机充电只能使用5V电压
        iVoltage5V.output5V();
    }
}
```

###### 对象适配器模式
基本思路和类的适配器模式相同，只是将 Adapter 类作修改，不是继承被适配 类，而是持有 被适配 类的实例，以解决兼容性的问题。根据“ 合成复用原则”，在系统中尽量使用 关联关系（聚合）来替代继承关系。对象适配器模式是适配器模式常用的一种。
- 适配器类

```java
public class VoltageAdapter implements IVoltage5V {

    private String voltage;

    public VoltageAdapter(String voltage, Voltage220V voltage220V) {
        this.voltage = voltage;
        this.voltage220V = voltage220V;
    }

    private Voltage220V voltage220V;

    @Override
    public void output5V() {
        // 可扩展方法output220V，而不修改output220V的源码
        System.out.println("调用5V...");
        if ("220".equals(voltage)) {
            voltage220V.output220V();
        }
    }
}

```

###### 接口适配器
缺省适配器模式(Default Adapter Pattern)：当不需要实现一个接口所提供的所有方法时，可先设计一个抽象类实现该接口，并为接口中每个方法提供一个默认实现（空方法），那么该抽象类的子类可以选择性地覆盖父类的某些方法来实现需求，它适用于不想使用一个接口中的所有方法的情况，又称为单接口适配器模式

- 定义接口
```java
public interface IService {
    void method1();
    void method2();
    void method3();
}
```

- 定义抽象类

```java
public abstract class AbstractService implements IService {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}

```

- 定义调用

```java
public class ServiceImpl {
    public void test(IService iService) {
        // 只需要用到method1
        iService.method1();
    }
}
```

- 测试类

```java
public class Demo03Test {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        service.test(new AbstractService() {
            @Override
            public void method1() {
                System.out.println("我是重写的method1...");
            }
        });
        /**
         * 我是重写的method1...
         */
    }
}
```

- 接口适配器模式经典例子

java.awt.KeyListener是一个键盘监听器接口，我们把这个接口的实现类对象注册进容器后，这个容器就会对键盘行为进行监听。
```java
public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("hey geek!");
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
```

我们仅使用了一个方法，却实现了接口里的所有方法，如果接口中的方法很多，会造成需要冗余的代码。于是JAVA里为java.awt.KeyListener提供了这样一个适配器：java.awt.KeyAdapter
```java
public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("fxcku!");
            }
        });
    }
```
只需要实现自己需要的方法即可

###### 总结
适配器模式的优缺点
- 优点
1. 将目标类和适配者类解耦，通过引入一个适配器类来重用现有的适配者类，无须修改原有结构
2. 更好的扩展性：在实现适配器功能的时候，可以扩展自己源的行为（增加方法），从而自然地扩展系统的功能
3. 增加了类的透明性和复用性，将具体的业务实现过程封装在适配者类中，对于客户端类而言是透明的，而且提高了适配者的复用性，同一个适配者类可以在多个不同的系统中复用
- 缺点
1. 在Java中，类适配器模式中的目标抽象类只能为接口，不能为类，其使用有一定的局限性。
2. 适配者类不能为最终类，如在Java中不能为final类
3. 对象适配器模式的缺点： 与类适配器模式相比，要在适配器中置换适配者类的某些方法比较麻烦。如果一定要置换掉适配者类的一个或多个方法，可以先做一个适配者类的子类，将适配者类的方法置换掉，然后再把适配者类的子类当做真正的适配者进行适配，实现过程较为复杂

- 适用场景

1. 系统需要使用一些现有的类，而这些类中接口(如方法名)不符合要求，需要扩展方法，或者没有源代码

2. 想创建一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作

#### 桥接模式

桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。更容易理解的表述是：实现系统可从多种维度分类，桥接模式将各维度抽象出来，各维度独立变化，之后可通过聚合，将各维度组合起来，减少了各维度间的耦合。

- 抽象变速器

```java
public abstract class Transmission {
    public abstract String gear();
}
```

- 手动挡

```java
public class Manual extends Transmission {
    @Override
    public String gear() {
        return "手动挡";
    }
}
```

- 自动档

```java
public class Auto extends Transmission {
    @Override
    public String gear() {
        return "自动档";
    }
}
```

- 宝马汽车

```java
public class BMW extends AbstractCar {
    @Override
    public void run() {
        String gear = super.gear.gear();
        System.out.println(gear + "宝马");
    }
}
```
- 奥迪汽车

```java
public class Audi extends AbstractCar{
    @Override
    public void run() {
        String gear = super.gear.gear();
        System.out.println(gear + "奥迪");
    }
}
```
- 测试类

```java
public class Demo01Test {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        Auto auto = new Auto();
        bmw.setTransmission(auto);
        bmw.run();

        Manual manual = new Manual();
        bmw.setTransmission(manual);
        bmw.run();
        /**
         * 自动档宝马
         * 手动挡宝马
         */
    }
}
```
- 总结
优点：
1. 实现了抽象和实现部分的分离，从而极大的提供了系统的灵活性，让抽象部分和实现部分独立开来，这有助于系统进行分层设计，从而产生更好的结构化系统
2. 桥接模式替代多层继承方案，可以减少 子类的个数，降低系统的管理和维护成本
3. 桥接模式提高了系统的可扩展性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统，符合“开闭原则”

缺点：
1. 桥接模式的使用会增加系统的理解与设计难度，由于关联关系建立在抽象层，要求开发者一开始就针对抽象层进行设计与编程。
2. 桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围具有一定的局限性，如何正确识别两个独立维度也需要一定的经验积累。

适用场景：
1. 一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行扩展
2. 不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统
