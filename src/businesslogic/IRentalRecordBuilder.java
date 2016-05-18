package businesslogic;

import model.AbstractRentalRecord;
import model.Customer;
import model.Employee;
import model.Item;

public interface IRentalRecordBuilder {

	/**
	 * Sets the employee who is registering the rental record
	 * 
	 * @param Employee
	 * 
	 */
	public void setEmployee(Employee employee);

	/**
	 * Sets the customer who is borrowing the Items
	 * 
	 * @param Customer
	 * 
	 */
	public void setCustomer(Customer customer);

	/**
	 * Add and Item to the RentalRecord, in that way is possible to borrow
	 * several items at the same time
	 * 
	 * @param Item
	 */
	public void addItem(Item item);

	public AbstractRentalRecord getRentalRecord();
}
