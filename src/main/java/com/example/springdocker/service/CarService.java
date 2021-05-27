package com.example.springdocker.service;

import com.example.springdocker.model.Car;
import com.example.springdocker.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Iryna Gnatenko
 * Date 2021-05-15
 * Time 10:05 PM
 * Project springdocker
 */

@RequiredArgsConstructor
@Service
public class CarService {
    private final CarRepository repository;

    public List<Car> getCars() {

        return repository.findAll();
    }

    public void saveNewCar (Car car) {
        repository.save(car);
    }

    public List<String> getAvailableCars() {

        List<Car> availableCars = repository.findIfInStock(true);

        // returnerar endast Car namnen i en lista
        return availableCars.stream()
                .map(car -> car.getModel())
                .collect(Collectors.toList());
    }
}
