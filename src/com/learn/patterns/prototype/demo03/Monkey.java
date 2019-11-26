package com.learn.patterns.prototype.demo03;

import java.io.*;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
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
