package com.demo.smartcard.station;

public class Station {
	
	private StationEnum station;
	private Boolean isTerminal;
	
	public Boolean getIsTerminal() {
		return isTerminal;
	}
	public void setIsTerminal(Boolean isTerminal) {
		this.isTerminal = isTerminal;
	}
	public StationEnum getStation() {
		return station;
	}
	public void setStation(StationEnum station) {
		this.station = station;
	}
	@Override
	public String toString() {
		return "Station [station=" + station + ", is "+(isTerminal?"":" not ")+"Terminal ]";
	}

}
