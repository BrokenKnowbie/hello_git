package com.test.DAO;

public abstract class Cat extends Animal {
    public Cat (String Type){
        System.out.println("有参构造");
    }

    public Cat(){
        System.out.println("无参构造1");
    }
}
