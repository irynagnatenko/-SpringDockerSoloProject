package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Iryna Gnatenko
 * Date 2021-05-15
 * Time 10:04 PM
 * Project springdocker
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    String id;
    String model;
    int modelYear;
    boolean isInStock;
}
