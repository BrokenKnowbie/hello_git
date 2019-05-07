/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2019 All Rights Reserved.
 */
package com.test.pojo;

import com.test.DAO.Plant;

/**
 * @author liu_bei
 * @version Id: Pear.java, v 0.1 2019/5/5 14:08 liu_bei Exp $$
 */
public class Pear extends Plant {
    public Pear(int age){
        this.setType("梨");
        this.setAge(age);
        this.setDefAttribute(this.getAge()*1L);
        this.setYaoXing(this.getAge()+60L);
        this.setBaoShiDu(30L);
    }
}