package com.rd.spring.cars.controllers;

import com.rd.spring.cars.model.CarResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @GetMapping
    public ResponseEntity<List<CarResponse>> getCars() {
        List<CarResponse> cars = new ArrayList<>();
        cars.add(new CarResponse("1", "Audi"));
        return ResponseEntity.ok(cars);
    }

}
