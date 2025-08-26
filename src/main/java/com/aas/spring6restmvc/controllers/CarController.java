package com.aas.spring6restmvc.controllers;

import com.aas.spring6restmvc.models.Car;
import com.aas.spring6restmvc.services.CarService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/cars")
public class CarController {
    private final CarService carService;

    @PostMapping
    public ResponseEntity handlePost(@RequestBody Car car) {
        Car savedCar = carService.saveNewCar(car);
        return new ResponseEntity(HttpStatus.CREATED);
    }

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
