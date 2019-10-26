package com.ceng.tutorial.factory;

import com.ceng.tutorial.factory.service.CarManufacturer;
import com.ceng.tutorial.factory.service.FordManufacturer;
import com.ceng.tutorial.factory.service.ToyotaManufacturer;
import com.ceng.tutorial.factory.service.WolksvagenManufacturer;

/**
 * @author Cengizhan Ozcan
 */
public class Main {

    public static void main(String[] args) {
        CarManufacturer fordManufacturer = new FordManufacturer();
        CarManufacturer wolksvagenManufacturer = new WolksvagenManufacturer();
        CarManufacturer toyotaManufacturer = new ToyotaManufacturer();

        fordManufacturer.createCar();
        wolksvagenManufacturer.createCar();
        toyotaManufacturer.createCar();

        fordManufacturer.printCarInfo();
        wolksvagenManufacturer.printCarInfo();
        toyotaManufacturer.printCarInfo();
    }

}
