package com.test.pojo;

import com.test.DAO.Plant;
import org.junit.Test;

public class ChineseTest {
    Plant apple = new Apple(2);
    Plant pear = new Pear(3);
    Chinese zhang = new Chinese("张三");
    Chinese li    = new Chinese("李四");

    @Test
    public void attack() {
        zhang.showInfo();
        li.showInfo();
        zhang.attack(li);
        li.eat(pear);
        zhang.showInfo();
        li.showInfo();
        li.attack(zhang);
        li.showInfo();
        zhang.showInfo();
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