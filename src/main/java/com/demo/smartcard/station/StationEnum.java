package com.demo.smartcard.station;


public enum StationEnum {
    A1(1),A2(2),A3(3),A4(4),A5(5),A6(6),A7(7),A8(8),A9(9),A10(10);
    private int station;

    StationEnum(int station) {
        this.station = station;
    }
    
    public int getStation() {
    	return this.station;
    }
}
