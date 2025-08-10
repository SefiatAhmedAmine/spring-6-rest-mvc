package com.aas.spring6restmvc.controllers;

import com.aas.spring6restmvc.models.Car;
import com.aas.spring6restmvc.services.CarService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/cars")
public class CarController {
    private final CarService carService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getCars() {
        return carService.getCars();
    }

    @RequestMapping(value = "/{carId}", method =  RequestMethod.GET)
    public Car getCarById(@PathVariable("carId") UUID carId) {
        log.debug("CarServiceImpl.getCarById was called with carId={}", carId);
        return carService.getCarById(carId);
    }
}
