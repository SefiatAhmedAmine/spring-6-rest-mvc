package com.aas.spring6restmvc.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarControllerTest {

    @Autowired
    CarController carController;

    @Test
    void getCarById() {
        System.out.println(carController.getCarById(UUID.randomUUID()));
    }
}