/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2019 All Rights Reserved.
 */
package com.test.DAO;

/**
 * @author liu_bei
 * @version Id: Animal.java, v 0.1 2019/5/5 9:58 liu_bei Exp $$
 */
public abstract class Animal {
    private Long STR;
    private Long DEF;
    private Long HEALTH;
    private int  age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getSTR() {
        return STR;
    }

    public void setSTR(Long STR) {
        this.STR = STR;
    }

    public Long getDEF() {
        return DEF;
    }

    public void setDEF(Long DEF) {
        this.DEF = DEF;
    }

    public Long getHEALTH() {
        return HEALTH;
    }

    public void setHEALTH(Long HEALTH) {
        this.HEALTH = HEALTH;
    }

    public abstract void attack(Animal animal);

    public abstract void eat(Plant plant);
}