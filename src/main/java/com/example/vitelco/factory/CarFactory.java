package com.example.vitelco.factory;

import com.example.vitelco.enums.CarType;
import com.example.vitelco.model.Cabrio;
import com.example.vitelco.model.Car;
import com.example.vitelco.model.Hatchback;
import com.example.vitelco.model.Sedan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2021-01-20
 */

@Service
public class CarFactory {

	/**
	 * This method produces and returns a car.
	 * @param carType - Is an Enum which determines type of the car.
	 * @return Car - Returns the car which created by given type.
	 * */
	public Car createCarByType(CarType carType) {

		if (carType == null || carType.equals(CarType.NONE)) {
			return null;
		}

		Car car = null;
		switch (carType) {
			case CABRIO: car = new Cabrio();break;
			case SEDAN: car = new Sedan(); break;
			case HATCHBACK: car = new Hatchback();
		}

		return car;
	}
}
