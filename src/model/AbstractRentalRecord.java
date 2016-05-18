package model;

import java.util.Date;

import businesslogic.Payment;

abstract public class AbstractRentalRecord {

	/**
	 * Executes the Payment process
	 * 
	 * @param payment
	 * @return boolean
	 */
	abstract public boolean processPayment(Payment payment);

	/**
	 * Marks the RentalRecord as finished, It must be called when the Customer
	 * return back the borrowed item, and pass around an end date
	 * 
	 * @param date
	 */
	abstract public void closeRecord(Date date);

	/**
	 * This method must be implemented if want to add any fines calculation to the rental process
	 * @return
	 */
	abstract public double calculateFine();

}
