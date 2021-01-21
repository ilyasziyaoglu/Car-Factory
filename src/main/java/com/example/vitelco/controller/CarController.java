package com.example.vitelco.controller;

import com.example.vitelco.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ilyas Ziyaoglu
 * @date 2021-01-20
 */

@RestController
@AllArgsConstructor
public class CarController {

	final private CarService carService;

	@PostMapping(consumes = "text/plain")
	public String createCar(@RequestBody String carType) {
		return carService.getCarByType(carType);
	}
}
