package com.aas.spring6restmvc.controllers;

import com.aas.spring6restmvc.models.Car;
import com.aas.spring6restmvc.services.CarService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
public class CarController {
    private final CarService carService;

    @RequestMapping("/api/v1/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    public Car getCarById(UUID carId) {
        log.debug("CarServiceImpl.getCarById was called with carId={}", carId);
        return carService.getCarById(carId);
    }
}
