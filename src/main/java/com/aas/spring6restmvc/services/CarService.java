package com.aas.spring6restmvc.services;

import com.aas.spring6restmvc.models.Car;

import java.util.List;
import java.util.UUID;

public interface CarService {
    List<Car> getCars();
    Car getCarById(UUID carId);
    Car saveNewCar(Car car);
}
