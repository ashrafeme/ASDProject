package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import businesslogic.Payment;

public class RentalRecord extends AbstractRentalRecord {

	private Employee employee;
	private List<Item> items;
	private LocalDate startDate;
	private LocalDate endDate;
	private String status;

	public RentalRecord(Employee employee, List<Item> items,
			LocalDate startDate, LocalDate endDate, String status) {
		super();
		this.employee = employee;
		this.items = items;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public Employee getEmployee() {
		return employee;
	}

	public List<Item> getItems() {
		return items;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public void processPayment(Payment payment, String cardNumber) {
		payment.setCardNumber(cardNumber);
		payment.processPayment(cardNumber);
	}

	@Override
	public void calculateFine(Date date) {
		System.out.println("calculating fine...............");
	}

}
