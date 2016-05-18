package client;

import java.util.Date;

import businesslogic.Email;
import businesslogic.FactoryPayment;
import businesslogic.IRentalRecordBuilder;
import businesslogic.Payment;
import businesslogic.PaymentMethod;
import businesslogic.RentalRecordBuilder;
import businesslogic.SMS;
import model.Address;
import model.Customer;
import model.Employee;
import model.IVisitable;
import model.Item;
import model.PhoneNumber;
import model.RentalRecord;

public class Client<T> {

	public static void main(String[] args) {

		// Creating Items
		Car BMW = new Car("BMW", 100, "1234", true, 12);
		Car lamboguine = new Car("Lamboguine", 1001, "1534", true, 9);

		// Creating Employee
		Employee employee = new Employee("David", "James", new Date());

		// Creating a customer
		Customer customer = new Customer("Solomon", "Carl", new Date());
		customer.setCardNumber("123456");

		// Creating phone Number
		PhoneNumber phoneNummber = new PhoneNumber("+91", "23455555");

		// creating address
		Address address = new Address("4th street", "fairField", "Iowa",
				"5555", "USA");

		// creating Rental Record
		IRentalRecordBuilder builder = new RentalRecordBuilder();
		builder.setCustomer(customer);
		builder.setEmployee(employee);
		builder.addItem(lamboguine);
		builder.addItem(BMW);
		RentalRecord rentalRecord = (RentalRecord) builder.getRentalRecord();

		// setting custommer fields
		customer.setAddress(address);
		customer.addPhoneNumber(phoneNummber);
		customer.addRentalRecord(rentalRecord);

		// process RentalPaymet for customer
		Payment payment = FactoryPayment.getInstance().createPayment(
				PaymentMethod.PAYPAL);
		payment.setAmount(BMW.getRentalPrice());
		payment.setCardNumber(customer.getCardNumber());
		// register observers
		payment.attachObserver(new Email());
		payment.attachObserver(new SMS());

		// charging customers
		payment.charge();

		// closing rental process
		;
		for(RentalRecord record:customer.getRentalHistory()){
			for(IVisitable item:record.getItems()){
				
			}
		}

	}

	public void processPayment(Customer customer) {

	}

}
