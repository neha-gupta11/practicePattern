package com.demo.smartcard.travel;

import com.demo.smartcard.SmartCard;
import com.demo.smartcard.station.StationEnum;

public class TravelDetails {
	
	private SmartCard card;
	private StationEnum swipeInStation;
	private StationEnum swipeOutStation;
	private float initialBalance;
	private float amountCharged;
	private long inTime;
	
	public SmartCard getCard() {
		return card;
	}
	public void setCard(SmartCard card) {
		this.card = card;
	}
	public StationEnum getSwipeInStation() {
		return swipeInStation;
	}
	public void setSwipeInStation(StationEnum swipeInStation) {
		this.swipeInStation = swipeInStation;
	}
	public StationEnum getSwipeOutStation() {
		return swipeOutStation;
	}
	public void setSwipeOutStation(StationEnum swipeOutStation) {
		this.swipeOutStation = swipeOutStation;
	}
	public float getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(float initialBalance) {
		this.initialBalance = initialBalance;
	}
	public float getAmountCharged() {
		return amountCharged;
	}
	public void setAmountCharged(float amountCharged) {
		this.amountCharged = amountCharged;
	}
	public long getInTime() {
		return inTime;
	}
	public void setInTime(long inTime) {
		this.inTime = inTime;
	}
	public long getOutTime() {
		return outTime;
	}
	public void setOutTime(long outTime) {
		this.outTime = outTime;
	}
	private long outTime;

	@Override
	public String toString() {
		return "TravelDetails [card=" + card + ", swipeInStation=" + swipeInStation + ", swipeOutStation="
				+ swipeOutStation + ", initialBalance=" + initialBalance + ", amountCharged=" + amountCharged
				+ ", inTime=" + inTime + ", outTime=" + outTime + "]";
	}
	
	
	

}
