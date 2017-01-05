package com.merkan.entity;

import javax.persistence.Column;

/**
 * Created by volodymyr on 05.01.17.
 */
public class BusinessCar {

    @Column(name = "PRICE")
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
