package com.skillabb.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Account {
	private String customerName;
	private String accountNumber;
	private double balance;
	private LocalDate fecha; 
	private LocalTime hora;
	
	public Account(String customerName, String accountNumber, double balance){
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.fecha = LocalDate.now();
		this.hora  = LocalTime.now();
		
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
	
	
}
