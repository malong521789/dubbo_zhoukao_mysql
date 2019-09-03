package com.zb.entity;
//test
//test2222
import java.io.Serializable;

public class Order implements Serializable {
    private int id;
    private String name;
    private int uid;
    private double price;

    public Order() {
    }

    public Order(int id, String name, int uid, double price) {
        this.id = id;
        this.name = name;
        this.uid = uid;
        this.price = price;
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

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
