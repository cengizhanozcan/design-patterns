package com.ceng.tutorial.builder.service;

import com.ceng.tutorial.builder.model.Brand;
import com.ceng.tutorial.builder.model.Color;
import com.ceng.tutorial.builder.model.Model;

/**
 * @author Cengizhan Ozcan
 */
public class WolksvagenOrderBuilder extends OrderBuilder {

    public void setBrand(Brand brand) {
        super.getCar().setBrand(brand);
    }

    public void setModel(Model model) {
        super.getCar().setModel(model);
    }

    public void setColor(Color color) {
        super.getCar().setColor(color);
    }

    public void setYear(Integer year) {
        super.getCar().setYear(year);
    }
}
