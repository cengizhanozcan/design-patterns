package com.ceng.tutorial.builder.service;

import com.ceng.tutorial.builder.model.Brand;
import com.ceng.tutorial.builder.model.Car;
import com.ceng.tutorial.builder.model.Color;
import com.ceng.tutorial.builder.model.Model;

/**
 * @author Cengizhan Ozcan
 */
public abstract class OrderBuilder {

    private Car car;

    public Car getCar() {
        if (car == null) {
            car = new Car();
        }

        return car;
    }

    public abstract void setBrand(Brand brand);

    public abstract void setModel(Model model);

    public abstract void setColor(Color color);

    public abstract void setYear(Integer year);


}
