package com.test.DAO;

public abstract class Humen extends Animal {
    private String name;

    public Humen(String name) {
        this.name = name;
    }

    public Humen(){
        this.setAge(0);
        this.setSTR(10L);
        this.setDEF(0L);
        this.setHEALTH(100L);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
