package com.ceng.tutorial.builder.service;

import com.ceng.tutorial.builder.model.Brand;
import com.ceng.tutorial.builder.model.Car;
import com.ceng.tutorial.builder.model.Color;
import com.ceng.tutorial.builder.model.Model;

/**
 * @author Cengizhan Ozcan
 */
public class OrderManager {

    private OrderBuilder orderBuilder = null;

    public Car createOrder(Brand brand, Model model, Color color, Integer year) {

        if ("Ford".equalsIgnoreCase(brand.getName())) {
            orderBuilder = new FordOrderBuilder();
        } else if ("Wolksvagen".equalsIgnoreCase(brand.getName())) {
            orderBuilder = new WolksvagenOrderBuilder();
        }

        orderBuilder.setBrand(brand);
        orderBuilder.setModel(model);
        orderBuilder.setColor(color);
        orderBuilder.setYear(year);

        return orderBuilder.getCar();
    }

    public void print() {
        System.out.println("Brand: " + orderBuilder.getCar().getBrand().getName());
        System.out.println("Model: " + orderBuilder.getCar().getModel().getName());
        System.out.println("Color: " + orderBuilder.getCar().getColor().getName());
        System.out.println("Year: " + orderBuilder.getCar().getYear());
        System.out.println("-----------------------");
    }
}
