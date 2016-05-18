package businesslogic;

import java.util.Date;

import model.AbstractRentalRecord;
import model.Customer;
import model.Employee;
import model.Item;
import model.RentalRecord;

public class RentalRecordBuilder implements IRentalRecordBuilder {

	private RentalRecord rentalRecord;

	private RentalRecordBuilder() {
		this.rentalRecord = new RentalRecord();
		this.rentalRecord.setStartDate(new Date());
		this.rentalRecord.setStatus("OPEN");
	}

	@Override
	public void setEmployee(Employee employee) {
		this.rentalRecord.setEmployee(employee);
	}

	@Override
	public void setCustomer(Customer customer) {
		this.rentalRecord.setCustomer(customer);
	}

	@Override
	public void addItem(Item item) {
		this.rentalRecord.addItem(item);
	}

	@Override
	public AbstractRentalRecord getRentalRecord() {
		return this.rentalRecord;
	}

}
