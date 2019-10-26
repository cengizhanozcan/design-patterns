package com.ceng.tutorial.prototype.model;

/**
 * @author Cengizhan Ozcan
 */
public class Dog extends AnimalPrototype {

    public Dog(String name, Integer age, Double lifeTimeCost) {
        super(name, age, lifeTimeCost);
    }

    public String type() {
        return "Dog";
    }
}
