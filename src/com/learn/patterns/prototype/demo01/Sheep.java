package com.learn.patterns.prototype.demo01;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
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
