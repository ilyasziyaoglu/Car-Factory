package com.example.vitelco.factory;

import com.example.vitelco.enums.CarType;
import com.example.vitelco.model.Car;
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
		assertEquals(car.getType(), CarType.CABRIO);
	}

	@Test
	void createCarByTypeSedan() {
		Car car = carFactory.createCarByType(CarType.SEDAN);

		assertNotNull(car);
		assertEquals(car.getType(), CarType.SEDAN);
	}

	@Test
	void createCarByTypeHatchback() {
		Car car = carFactory.createCarByType(CarType.HATCHBACK);

		assertNotNull(car);
		assertEquals(car.getType(), CarType.HATCHBACK);
	}

	@Test
	void createCarByTypeNone() {
		Car car = carFactory.createCarByType(CarType.NONE);

		assertNull(car);
	}

	@Test
	void createCarByTypeInvalid() {
		Car car = carFactory.createCarByType(null);

		assertNull(car);
	}
}