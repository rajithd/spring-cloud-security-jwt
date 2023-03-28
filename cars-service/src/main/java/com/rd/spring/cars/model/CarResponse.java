package com.rd.spring.cars.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CarResponse {

    private final String carId;
    private final String carName;

}
