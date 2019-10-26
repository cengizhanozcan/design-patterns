package com.ceng.tutorial.builder;

import com.ceng.tutorial.builder.model.Brand;
import com.ceng.tutorial.builder.model.Color;
import com.ceng.tutorial.builder.model.Model;
import com.ceng.tutorial.builder.service.OrderManager;

/**
 * @author Cengizhan Ozcan
 */
public class Main {

    public static void main(String[] args) {
        OrderManager fiestaOrderManager = new OrderManager();
        fiestaOrderManager.createOrder(new Brand("Ford"), new Model("Fiesta"), new Color("Red"), 2019);
        fiestaOrderManager.print();

        OrderManager focusOrderManager = new OrderManager();
        focusOrderManager.createOrder(new Brand("Ford"), new Model("Focus"), new Color("White"), 2019);
        focusOrderManager.print();

        OrderManager poloOrderManager = new OrderManager();
        poloOrderManager.createOrder(new Brand("Wolksvagen"), new Model("Polo"), new Color("White"), 2019);
        poloOrderManager.print();
    }
}
