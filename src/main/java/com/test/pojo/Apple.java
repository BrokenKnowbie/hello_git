/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2019 All Rights Reserved.
 */
package com.test.pojo;

import com.test.DAO.Plant;

/**
 * @author liu_bei
 * @version Id: Apple.java, v 0.1 2019/5/5 11:03 liu_bei Exp $$
 */
public class Apple extends Plant {
    public Apple(int age){
        this.setType("苹果");
        this.setAge(age);
        this.setStrAttribute(this.getAge()*1L);
        this.setYaoXing(this.getAge()+50L);
        this.setBaoShiDu(30L);
    }
}