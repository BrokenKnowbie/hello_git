package com.test.DAL;

public class Test {
    public static void main(String[] args) {
        ConnGit c = new ConnGit("张三");
        c.printName();
        c.equals(null);
        c.setAge(32);
        c.setCardId("420193201223011");
        Integer age = c.getAge();
        System.out.println(age);
        Hello hello = new Hello();
        hello.helloWorld(c);
        System.out.println("第二个版本了");
    }
}
