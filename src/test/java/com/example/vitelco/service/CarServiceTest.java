package com.example.vitelco.service;

import com.example.vitelco.enums.CarType;
import com.example.vitelco.factory.CarFactory;
import com.example.vitelco.model.Cabrio;
import com.example.vitelco.model.Car;
import com.example.vitelco.model.Hatchback;
import com.example.vitelco.model.Sedan;
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
		assertEquals(message, "Cabrio Car has produced.");
	}

	@Test
	void getCarSedan() {
		Car car = new Sedan();
		when(carFactory.createCarByType(ArgumentMatchers.any(CarType.class))).thenReturn(car);

		String message = carService.getCarByType("sedan");
		assertEquals(message, "Sedan Car has produced.");
	}

	@Test
	void getCarHatchback() {
		Car car = new Hatchback();
		when(carFactory.createCarByType(ArgumentMatchers.any(CarType.class))).thenReturn(car);

		String message = carService.getCarByType("hatchback");
		assertEquals(message, "Hatchback Car has produced.");
	}

	@Test
	void getCarNone() {
		String message = carService.getCarByType("");
		assertEquals(message, "Car can not created. Car type is invalid!");
	}

	@Test
	void getCarNull() {
		String message = carService.getCarByType(null);
		assertEquals(message, "Car can not created. Car type is invalid!");
	}

	@Test
	void getCarInvalid() {
		String message = carService.getCarByType("asdasdasad");
		assertEquals(message, "Car can not created. Car type is invalid!");
	}
}