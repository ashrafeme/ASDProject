package client;

import java.util.Arrays;
import java.util.List;

import model.Address;
import model.Customer;
import model.Employee;
import model.Item;
import model.PhoneNumber;
import model.RentalRecord;

public class Client {

	public static void main(String[] args) {
		// adding items to invetory
		Item item = buildItem("car1", 100, "1234", true, 12);
		Item item2 = buildItem("car2", 400, "1534", true, 10);
		List<Item> items = Arrays.asList(item, item2);

		// Creating Employee
		Employee employee = new Employee("David", "James", "03/02/1990");

		// Creating a customer
		Customer customer = new Customer("Solomon", "Carl", "05/15/1987");

		// Creating phone Number
		PhoneNumber phoneNummber = new PhoneNumber("+91", "23455555");

		// creating address
		Address address = new Address("4th street", "fairField", "Iowa",
				"5555", "USA");
		
		//Creating a rental Record
		RentalRecord record = new RentalRecord();
		

	}

	public static Item buildItem(String itemName, double rentalPrice,
			String code, boolean available, int stock) {
		Item item = new Item(itemName, rentalPrice, code, available, stock);
		return item;
	}

}
