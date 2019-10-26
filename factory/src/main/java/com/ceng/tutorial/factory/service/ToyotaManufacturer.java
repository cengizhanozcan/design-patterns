package com.ceng.tutorial.factory.service;

import com.ceng.tutorial.factory.model.Corolla;
import com.ceng.tutorial.factory.model.Yaris;

/**
 * @author Cengizhan Ozcan
 */
public class ToyotaManufacturer extends CarManufacturer {

    @Override
    public void createCar() {
        super.getCars().add(new Corolla());
        super.getCars().add(new Yaris());
    }
}
