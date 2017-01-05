package com.merkan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by volodymyr on 05.01.17.
 */
@Entity
public class SportCar extends Car {

    @Column(name = "SPEED")
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
