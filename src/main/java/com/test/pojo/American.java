/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2019 All Rights Reserved.
 */
package com.test.pojo;

import com.test.DAO.Animal;
import com.test.DAO.Humen;
import com.test.DAO.Plant;

/**
 * @author liu_bei
 * @version Id: American.java, v 0.1 2019/5/7 11:02 liu_bei Exp $$
 */
public class American extends Humen {


    public American(){}

    public American(String name){
        this.setName(name);
        this.setSTR(super.getSTR());
        this.setDEF(super.getDEF() + 2L);
        this.setHEALTH(super.getHEALTH());
    }

    @Override
    public void attack(Animal animal) {
        animal.setHEALTH(animal.getHEALTH() - this.getSTR() + animal.getDEF());
    }

    @Override
    public void eat(Plant plant) {
        this.setSTR(this.getSTR() + plant.getStrAttribute());
        this.setDEF(this.getDEF() + plant.getDefAttribute());
        this.setHEALTH(this.getHEALTH() + plant.getYaoXing());
    }

    public void showInfo() {
        System.out.println(this.getName() + "{生命：" + this.getHEALTH() + ";攻击：" + this.getSTR()
                + ";防御：" + this.getDEF() + "}");
    }
}