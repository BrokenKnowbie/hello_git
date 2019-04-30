package com.test.DAL;

public class Hello {
    public void helloWorld(){
        ConnGit c = new ConnGit("张三");
        System.out.println(c.getName()+":hello world");
    }
}
