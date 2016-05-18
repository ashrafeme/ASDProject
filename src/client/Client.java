package client;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import businesslogic.IRentalRecordBuilder;
import businesslogic.RentalRecordBuilder;
import model.Address;
import model.Customer;
import model.Employee;
import model.Item;
import model.PhoneNumber;
import model.RentalRecord;

public class Client {

	public static void main(String[] args) {
		
		// adding items to invetory
		Item item = new Item("car1", 100, "1234", true, 12);
		Item item2 = new Item("car2", 400, "1534", true, 10);
		List<Item> items = Arrays.asList(item, item2);

		// Creating Employee
		Employee employee = new Employee("David", "James", new Date());

		// Creating a customer
		Customer customer = new Customer("Solomon", "Carl", new Date());
		
		//customer.
		
		// customer.

		// Creating phone Number
		PhoneNumber phoneNummber = new PhoneNumber("+91", "23455555");

		// creating address
		Address address = new Address("4th street", "fairField", "Iowa", "5555", "USA");

		// Creating a rental Record
		IRentalRecordBuilder br = new RentalRecordBuilder();
		

	}
}
