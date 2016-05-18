package model;

import java.util.Date;

import businesslogic.*;

public abstract class AbstractRentalRecord {

	public final void beginRentalProcess(Payment payment) {
		processPayment(payment);
	}

	public final void closeRecord(Date date) {
		calculateFine(date);
	}

	public abstract void processPayment(Payment payment);

	public abstract void calculateFine(Date date);
}
