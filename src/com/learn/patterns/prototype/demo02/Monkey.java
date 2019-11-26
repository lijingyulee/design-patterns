package com.learn.patterns.prototype.demo02;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
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
