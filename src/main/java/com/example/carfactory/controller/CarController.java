package com.example.carfactory.controller;

import com.example.carfactory.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ilyas Ziyaoglu
 * @date 2021-01-20
 */

@RestController
@AllArgsConstructor
public class CarController {

	private final CarService carService;

	@PostMapping(consumes = "text/plain")
	public String createCar(@RequestBody String carType) {
		return carService.getCarByType(carType);
	}
}
