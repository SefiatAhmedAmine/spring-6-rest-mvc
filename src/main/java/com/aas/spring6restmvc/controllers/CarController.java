package com.aas.spring6restmvc.controllers;

import com.aas.spring6restmvc.models.Car;
import com.aas.spring6restmvc.services.CarService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
@AllArgsConstructor
@Slf4j
public class CarController {
    private final CarService carService;

    public Car getCarById(UUID carId) {
        log.debug("CarServiceImpl.getCarById was called with carId={}", carId);
        return carService.getCarById(carId);
    }
}
