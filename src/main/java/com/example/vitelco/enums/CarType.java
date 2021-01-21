package com.example.vitelco.enums;

/**
 * @author Ilyas Ziyaoglu
 * @date 2021-01-20
 */

public enum CarType {
	CABRIO("cabrio"), SEDAN("sedan"), HATCHBACK("hatchback"), NONE("none");

	CarType(String value) {
		this.value = value;
	}

	private final String value;

	public static CarType fromValue(String value) {
		for (CarType carType : values()) {
			if (carType.value.equals(value)) {
				return carType;
			}
		}
		return NONE;
	}
}
