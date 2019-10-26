package com.ceng.tutorial.prototype.model;

/**
 * @author Cengizhan Ozcan
 */
public class Cat extends AnimalPrototype {

    public Cat(String name, Integer age, Double lifeTimeCost) {
        super(name, age, lifeTimeCost);
    }

    public String type() {
        return "Cat";
    }
}
