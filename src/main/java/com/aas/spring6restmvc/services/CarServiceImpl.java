package com.aas.spring6restmvc.services;

import com.aas.spring6restmvc.models.Car;
import com.aas.spring6restmvc.models.CarStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@Service
public class CarServiceImpl implements CarService {

    private Map<UUID, Car> carMap;

    public CarServiceImpl() {
        this.carMap = new HashMap<>();

        Car car0 = Car.builder()
                .id(UUID.randomUUID())
                .carName("BMW X5")
                .carStyle(CarStyle.SUV)
                .price(BigDecimal.valueOf(250000.0))
                .year(2018)
                .quantityOnHand(20)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

        Car car1 = Car.builder()
                .id(UUID.randomUUID())
                .carName("Audi A3")
                .carStyle(CarStyle.SEDAN)
                .price(new BigDecimal(210000))
                .year(2019)
                .quantityOnHand(17)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
        Car car2 = Car.builder()
                .id(UUID.randomUUID())
                .carName("Bugatti Veyron")
                .carStyle(CarStyle.SEDAN)
                .price(new BigDecimal(210000))
                .year(2019)
                .quantityOnHand(17)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
        Car car3 = Car.builder()
                .id(UUID.randomUUID())
                .carName("Audi A3")
                .carStyle(CarStyle.SEDAN)
                .price(new BigDecimal(210000))
                .year(2019)
                .quantityOnHand(17)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
        this.carMap.put(car0.getId(), car0);
        this.carMap.put(car1.getId(), car1);
        this.carMap.put(car2.getId(), car2);
        this.carMap.put(car3.getId(), car3);
        }

    @Override
    public List<Car> getCars() {
        return new ArrayList<>(this.carMap.values());
    }

    @Override
    public Car getCarById(UUID carId) {
        log.debug("CarServiceImpl.getCarById was called with carId={}", carId);
        return carMap.get(carId);
    }

    @Override
    public Car saveNewCar(Car car) {
        log.debug("CarServiceImpl.saveNewCar was called with car={}", car);
        Car savedCar = Car.builder()
                .id(UUID.randomUUID())
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .carName(car.getCarName())
                .quantityOnHand(car.getQuantityOnHand())
                .price(car.getPrice())
                .year(car.getYear())
                .carStyle(car.getCarStyle())
                .build();

        carMap.put(savedCar.getId(), savedCar);
        return savedCar;
    }


}
