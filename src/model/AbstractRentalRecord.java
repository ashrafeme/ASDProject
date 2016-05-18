package model;

import java.util.Date;

import businesslogic.*;

public abstract class AbstractRentalRecord {

	public final void beginRentalProcess(Payment payment, String cardNumber) {
		processPayment(payment, cardNumber);
	}

	public final void closeRecord(Date date) {
		calculateFine(date);
	}

	public abstract void processPayment(Payment payment, String cardNumber);

	public abstract void calculateFine(Date date);
}
