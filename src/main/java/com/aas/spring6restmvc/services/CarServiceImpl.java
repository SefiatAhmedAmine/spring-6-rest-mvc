package com.aas.spring6restmvc.services;

import com.aas.spring6restmvc.models.Car;
import com.aas.spring6restmvc.models.CarStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class CarServiceImpl implements CarService {
    @Override
    public Car getCarById(UUID carId) {
        log.debug("CarServiceImpl.getCarById was called with carId={}", carId);
        return Car.builder()
                .id(carId)
                .carName("BMW X5")
                .carStyle(CarStyle.SUV)
                .price(BigDecimal.valueOf(250000.0))
                .year(2018)
                .quantityOnHand(20)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
    }
}
