package com.merkan.entity;

import javax.persistence.*;

/**
 * Created by volodymyr on 05.01.17.
 */

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity(name = "CAR")
public class Car {

    @Id
    private long id;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "CAR_TYPE")
    private Car_type carType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Car_type getCarType() {
        return carType;
    }

    public void setCarType(Car_type carType) {
        this.carType = carType;
    }
}


