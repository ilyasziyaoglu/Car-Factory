package com.example.carfactory.factory;

import com.example.carfactory.enums.CarType;
import com.example.carfactory.model.Car;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CarFactoryTest {

	@InjectMocks
	private CarFactory carFactory;

	@Test
	void createCarByTypeCabrio() {
		Car car = carFactory.createCarByType(CarType.CABRIO);

		assertNotNull(car);
		assertEquals(CarType.CABRIO, car.getType());
	}

	@Test
	void createCarByTypeSedan() {
		Car car = carFactory.createCarByType(CarType.SEDAN);

		assertNotNull(car);
		assertEquals(CarType.SEDAN, car.getType());
	}

	@Test
	void createCarByTypeHatchback() {
		Car car = carFactory.createCarByType(CarType.HATCHBACK);

		assertNotNull(car);
		assertEquals(CarType.HATCHBACK, car.getType());
	}

	@Test
	void createCarByTypeNone() {
		Car car = carFactory.createCarByType(null);

		assertNull(car);
	}

	@Test
	void createCarByTypeInvalid() {
		Car car = carFactory.createCarByType(null);

		assertNull(car);
	}
}