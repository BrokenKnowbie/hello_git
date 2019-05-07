package com.test.pojo;

import org.junit.Test;

import com.test.DAO.Plant;

public class ChineseTest {
    Plant apple = new Apple(2);
    Plant pear = new Pear(3);
    Chinese zhang = new Chinese("张三");
    American li    = new American("斯坦李");

    @Test
    public void attack() {
        zhang.showInfo();
        li.showInfo();
        System.out.println("-----分割线------------------");
        zhang.attack(li);
        zhang.showInfo();
        li.showInfo();
        System.out.println("-----分割线------------------");
        pear.showInfo();
        li.eat(pear);
        li.showInfo();
        System.out.println("-----分割线------------------");
        while (li.getHEALTH()>0){
            zhang.attack(li);
            zhang.showInfo();
            li.showInfo();
        }

    }

    @Test
    public void eat() {
        zhang.showInfo();
        apple.showInfo();
        pear.showInfo();
        zhang.eat(apple);
        zhang.showInfo();
        zhang.eat(pear);
        zhang.showInfo();

    }

    @Test
    public void testCat(){
        BlackCat c = new BlackCat();
    }
}