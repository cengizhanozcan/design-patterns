package com.ceng.tutorial.prototype;

import com.ceng.tutorial.prototype.model.AnimalPrototype;
import com.ceng.tutorial.prototype.model.Dog;

/**
 * @author Cengizhan Ozcan
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        AnimalPrototype dog = new Dog("Max", 2, new Double(5600.70));
        dog.print();

        AnimalPrototype clonnedCat = (AnimalPrototype) dog.clone();
        clonnedCat.setName("Cat");
        clonnedCat.print();

        AnimalPrototype clonnedHorse = (AnimalPrototype) dog.clone();
        clonnedHorse.setName("Horse");
        clonnedHorse.print();
    }
}
