package com.example.vitelco.service;

import com.example.vitelco.enums.CarType;
import com.example.vitelco.factory.CarFactory;
import com.example.vitelco.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2021-01-20
 */

@Service
@AllArgsConstructor
public class CarService {
	private final CarFactory carFactory;

	/**
	* This method creates a car by using CarFactory and returns process information.
	 * @param carTypeStr - Is a string which one of CarType values.
	 * @return String - Returns information abut car creation process.
	* */
	public String getCarByType(String carTypeStr) {

		// getting car type
		CarType carType= CarType.fromValue(carTypeStr);
		if (carType == null || carType.equals(CarType.NONE)) {
			return  "Car can not created. Car type is invalid!";
		}

		// creating car by type
		Car car = carFactory.createCarByType(carType);

		// preparing information message
		String message = "";
		switch (car.getType()) {
			case CABRIO: message = "Cabrio"; break;
			case SEDAN: message = "Sedan"; break;
			case HATCHBACK: message = "Hatchback"; break;
		}
		message += " Car has produced.";

		return message;
	}
}
