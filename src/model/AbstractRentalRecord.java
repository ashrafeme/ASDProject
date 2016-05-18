package model;

import java.util.Date;

import businesslogic.Payment;

abstract public class AbstractRentalRecord {
	
	abstract public boolean processPayment(Payment payment);
	
	abstract public void closeRecord(Date date);
	
	abstract public double calculateFine();

}
