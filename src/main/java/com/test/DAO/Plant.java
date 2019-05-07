/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2019 All Rights Reserved.
 */
package com.test.DAO;

/**
 * @author liu_bei
 * @version Id: Plant.java, v 0.1 2019/5/5 10:02 liu_bei Exp $$
 */
public abstract class Plant {
    private Integer age=0;
    private Long    yaoXing=0L;
    private Long    baoShiDu=0L;
    private Long    strAttribute=0L;
    private Long    defAttribute=0L;
    private Long    healthAttribute=0L;
    private String  type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getDefAttribute() {
        return defAttribute;
    }

    public void setDefAttribute(Long defAttribute) {
        this.defAttribute = defAttribute;
    }

    public Long getHealthAttribute() {
        return healthAttribute;
    }

    public void setHealthAttribute(Long healthAttribute) {
        this.healthAttribute = healthAttribute;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getYaoXing() {
        return yaoXing;
    }

    public void setYaoXing(Long yaoXing) {
        this.yaoXing = yaoXing;
    }

    public Long getBaoShiDu() {
        return baoShiDu;
    }

    public void setBaoShiDu(Long baoShiDu) {
        this.baoShiDu = baoShiDu;
    }

    public Long getStrAttribute() {
        return strAttribute;
    }

    public void setStrAttribute(Long strAttribute) {
        this.strAttribute = strAttribute;
    }

    public void showInfo() {
        System.out.println(this.getAge() + "年的" + this.getType() + "{治愈能力：" + this.getYaoXing() + "；饱食度："
                           + this.getBaoShiDu() + "；加攻" + this.getStrAttribute() + "；加防御"
                           + this.getDefAttribute() + "；加生命上限：" + this.getHealthAttribute() + "}");
    }
}