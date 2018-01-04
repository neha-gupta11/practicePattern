package com.demo.smartcard;

public enum DayType {
	WEEKEND(7),WEEKDAY(5.5f);
	
	private float dayType;

	DayType(float dayType) {
		this.dayType = dayType;
	}

	public float getDayType() {
		return dayType;
	}
	
}
