package businesslogic;

import model.AbstractRentalRecord;
import model.Customer;
import model.Employee;
import model.IVisitable;

public interface IRentalRecordBuilder {
	public void addEmployee(Employee employee);
	public void addCustomer(Customer customer);
	public void addItem(IVisitable item);
	public AbstractRentalRecord getRentalRecord();
}
