package com.ceng.tutorial.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Cengizhan Ozcan
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class AnimalPrototype implements Cloneable{

    private String name;

    private Integer age;

    // Lets think it was calculated
    private Double lifeTimeCost;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract String type();

    public void print(){
        System.out.println("Type: " + type());
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Life Time Cost: " + lifeTimeCost);
        System.out.println("--------------------------------");
    }
}
