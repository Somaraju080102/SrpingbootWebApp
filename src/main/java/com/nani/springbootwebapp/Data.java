package com.nani.springbootwebapp;

public class Data {
    private String val;
    private int age;
    public String getName() {
        return val;
    }
    public void setName(String val) {
        this.val = val;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Data [name=" + val + ", age=" + age + "]";
    }

    
}
