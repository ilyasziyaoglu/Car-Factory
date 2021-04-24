package com.example.carfactory.service;

import com.example.carfactory.enums.CarType;
import com.example.carfactory.factory.CarFactory;
import com.example.carfactory.model.Cabrio;
import com.example.carfactory.model.Car;
import com.example.carfactory.model.Hatchback;
import com.example.carfactory.model.Sedan;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CarServiceTest {

	@InjectMocks
	private CarService carService;

	@Mock
	private CarFactory carFactory;

	@Test
	void getCarCabrio() {
		Car car = new Cabrio();
		when(carFactory.createCarByType(ArgumentMatchers.any(CarType.class))).thenReturn(car);

		String message = carService.getCarByType("cabrio");
		assertEquals("Cabrio Car has produced.", message);
	}

	@Test
	void getCarSedan() {
		Car car = new Sedan();
		when(carFactory.createCarByType(ArgumentMatchers.any(CarType.class))).thenReturn(car);

		String message = carService.getCarByType("sedan");
		assertEquals("Sedan Car has produced.", message);
	}

	@Test
	void getCarHatchback() {
		Car car = new Hatchback();
		when(carFactory.createCarByType(ArgumentMatchers.any(CarType.class))).thenReturn(car);

		String message = carService.getCarByType("hatchback");
		assertEquals("Hatchback Car has produced.", message);
	}

	@Test
	void getCarNone() {
		String message = carService.getCarByType("");
		assertEquals("Car can not created. Car type is invalid!", message);
	}

	@Test
	void getCarNull() {
		String message = carService.getCarByType(null);
		assertEquals("Car can not created. Car type is invalid!", message);
	}

	@Test
	void getCarInvalid() {
		String message = carService.getCarByType("asdasdasad");
		assertEquals("Car can not created. Car type is invalid!", message);
	}
}