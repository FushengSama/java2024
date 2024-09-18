package com.example.springserver.po;

public class User {
    private int age;
    private String name;



    private String phone;
    private String uuid;
    public User(int age, String name, String phone, String uuid) {
        this.age = age;
        this.name = name;
        this.phone = phone;
        this.uuid = uuid;
    }

    public User() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
