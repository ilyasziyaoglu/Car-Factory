package com.example.carfactory.factory;

import com.example.carfactory.enums.CarType;
import com.example.carfactory.model.Cabrio;
import com.example.carfactory.model.Car;
import com.example.carfactory.model.Hatchback;
import com.example.carfactory.model.Sedan;
import org.springframework.stereotype.Service;

import java.util.Objects;

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

		if (Objects.isNull(carType)) {
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
