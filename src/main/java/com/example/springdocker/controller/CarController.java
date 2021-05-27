package com.example.springdocker.controller;

import com.example.springdocker.model.Car;
import com.example.springdocker.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Iryna Gnatenko
 * Date 2021-05-15
 * Time 10:01 PM
 * Project springdocker
 */

@RequiredArgsConstructor
@RestController
public class CarController {
    private final CarService service;

    @GetMapping("/cars")
    public List<Car> getCars() {
        return service.getCars();
    }

    @PostMapping("/cars/add")
    public void saveNewCar(@RequestBody Car car) {
        service.saveNewCar(car);
    }

    @GetMapping("/cars/available")
    public List<String> getAvailableCars() {
        return service.getAvailableCars();
    }

}
