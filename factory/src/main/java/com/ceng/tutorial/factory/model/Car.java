package com.ceng.tutorial.factory.model;

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
public class Car {

    private String brand;

    private String model;

    private Integer year;
}
