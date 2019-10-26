package com.ceng.tutorial.prototype.model;

/**
 * @author Cengizhan Ozcan
 */
public class Horse extends AnimalPrototype {

    public Horse(String name, Integer age, Double lifeTimeCost) {
        super(name, age, lifeTimeCost);
    }

    public String type() {
        return "Horse";
    }
}
