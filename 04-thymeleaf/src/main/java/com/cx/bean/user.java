package com.cx.bean;

public class user {

    private int id;
    private String name;
    private int age;
    private double sal;

    public user(int id, String name, int age, double sal) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
