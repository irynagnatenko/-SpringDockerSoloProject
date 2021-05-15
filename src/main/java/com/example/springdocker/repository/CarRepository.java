package com.example.springdocker.repository;

import com.example.springdocker.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Iryna Gnatenko
 * Date 2021-05-15
 * Time 10:04 PM
 * Project springdocker
 */

@Repository
public interface CarRepository extends MongoRepository<Car, String> {

        List<Car> findIfInStock(boolean isInStock);
}
