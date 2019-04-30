package com.test.DAL;

public class ConnGit {
    private String name;
    private String cardId;
    private Integer age;

    public ConnGit(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void printName(){
        System.out.println(name);
    }

}
