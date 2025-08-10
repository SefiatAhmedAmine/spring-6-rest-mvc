package com.aas.spring6restmvc.controllers;

import com.aas.spring6restmvc.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class CarController {
    private final CarService carService;
}
