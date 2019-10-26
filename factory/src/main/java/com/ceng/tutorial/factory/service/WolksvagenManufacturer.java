package com.ceng.tutorial.factory.service;

import com.ceng.tutorial.factory.model.Polo;

/**
 * @author Cengizhan Ozcan
 */
public class WolksvagenManufacturer extends CarManufacturer {

    public void createCar() {
        super.getCars().add(new Polo());
    }
}
