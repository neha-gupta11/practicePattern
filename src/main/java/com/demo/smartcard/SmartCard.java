package com.demo.smartcard;

public class SmartCard {

	private int cardNumber;
	private float balance;
	
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "SmartCard [cardNumber=" + cardNumber + ", balance=" + balance + "]";
	}
	
	
}
