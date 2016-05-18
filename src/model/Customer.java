package model;

import java.util.Date;
import java.util.List;

public class Customer extends Person {
	private List<PhoneNumber> phoneNumbers;
	private List<RentalRecord> rentalRecord;

	public Customer(String firstName, String lastName, Date dateOfBirth) {
		super(firstName, lastName, dateOfBirth);
	}

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<RentalRecord> getRentalRecord() {
		return rentalRecord;
	}

	public void setRentalRecord(List<RentalRecord> rentalRecord) {
		this.rentalRecord = rentalRecord;
	}

}
