package com.skillabb.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {
	private String customerName;
	private String accountNumber;
	private double balance;
	private LocalDate fecha; 
	private LocalTime hora;
	private List<String> cardNumber = new ArrayList<>();
	
	public Account(String customerName, String accountNumber, double balance){
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.fecha = LocalDate.now();
		this.hora  = LocalTime.now();
		this.cardNumber.add(UUID.randomUUID().toString());
		//this.cardNumber = cardNumber;
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public List<String> getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(List<String> cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "Account [customerName=" + customerName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", fecha=" + fecha + ", hora=" + hora + ", cardNumber=" + cardNumber + "]";
	}
}
