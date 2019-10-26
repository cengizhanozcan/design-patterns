package com.ceng.tutorial.factory.service;

import com.ceng.tutorial.factory.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cengizhan Ozcan
 */
public abstract class CarManufacturer {

    private List<Car> cars = new ArrayList<Car>();

    public abstract void createCar();

    public void printCarInfo(){
        this.cars.stream().forEach(item -> {
            System.out.println("Brand: " + item.getBrand());
            System.out.println("Model: " + item.getModel());
            System.out.println("Year: " + item.getYear());
            System.out.println("------------------------------");
        });
    }

    public List<Car> getCars() {
        return cars;
    }
}
