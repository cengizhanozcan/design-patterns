package com.ceng.tutorial.factory.service;

import com.ceng.tutorial.factory.model.Fiesta;
import com.ceng.tutorial.factory.model.Focus;

/**
 * @author Cengizhan Ozcan
 */
public class FordManufacturer extends CarManufacturer {

    public void createCar() {
        super.getCars().add(new Fiesta());
        super.getCars().add(new Focus());
    }
}
