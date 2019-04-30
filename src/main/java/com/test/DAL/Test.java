package com.test.DAL;

public class Test {
    public static void main(String[] args) {
        ConnGit c = new ConnGit("zhangsan-------");
        c.printName();
        c.equals(null);
        c.setAge(32);
        c.setCardId("420193201223011");
        Integer age = c.getAge();
        System.out.println(age);
    }
}
