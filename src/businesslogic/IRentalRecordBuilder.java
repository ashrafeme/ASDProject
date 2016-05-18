package businesslogic;

import model.AbstractRentalRecord;
import model.Customer;
import model.Employee;
import model.Item;

public interface IRentalRecordBuilder {
	
	public void newRecord();
	
	public void setEmployee(Employee employee);

	public void setCustomer(Customer customer);

	public void addItem(Item item);

	public AbstractRentalRecord getRentalRecord();
}
