package com.example.connection;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //
@Table(name = "user_name")
public class User {
    @Id
    private int id;
    private String name;
    private int age;
    private String mobileNumber;
    public User(){

    }

    public User(int id, String name, int age,String mobileNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNumber=mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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
}
