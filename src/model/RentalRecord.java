package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import businesslogic.Payment;

public class RentalRecord extends AbstractRentalRecord {

	private Employee employee;
	private Customer customer;
	private List<Item> items = new ArrayList<Item>();
	private Date startDate;
	private Date endDate;
	private String status;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}

	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean processPayment(Payment payment) {
		return payment.charge();
	}

	@Override
	public void closeRecord(Date date) {
		this.status = "CLOSED";
		this.endDate = date;
	}

	@Override
	public double calculateFine() {
		return 0;
	}

}
