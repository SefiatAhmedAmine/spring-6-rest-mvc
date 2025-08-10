package com.aas.spring6restmvc.services;

import com.aas.spring6restmvc.models.Car;

import java.util.UUID;

public interface CarService {
    Car getCarById(UUID carId);
}
