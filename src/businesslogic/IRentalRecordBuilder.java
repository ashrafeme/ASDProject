package businesslogic;

import model.AbstractRentalRecord;
import model.Customer;
import model.Employee;
import model.Item;

public interface IRentalRecordBuilder {
	
	/**
	 * Sets the employee who is registering the rental record
	 * @param Employee employee
	 */
	public void setEmployee(Employee employee);

	/**
	 * Sets the customer who is borrowing the Items
	 * @param Customer customer
	 */
	public void setCustomer(Customer customer);

	/**
	 * 
	 * @param item
	 */
	public void addItem(Item item);

	public AbstractRentalRecord getRentalRecord();
}
