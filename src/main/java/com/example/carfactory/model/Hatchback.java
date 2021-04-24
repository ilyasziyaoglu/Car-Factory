package com.example.carfactory.model;

import com.example.carfactory.enums.CarType;

/**
 * @author Ilyas Ziyaoglu
 * @date 2021-01-20
 */

public class Hatchback implements Car {

	private final CarType type = CarType.HATCHBACK;

	@Override
	public CarType getType() {
		return type;
	}
}
