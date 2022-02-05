package com.example.hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String name;
    private int age;

    @JsonProperty("phone-number")
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User() {
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Field's name of the class that Object mapper refer have to remove 'get'
    public User DefaultUser() {
        return new User("default",0,"no number");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
