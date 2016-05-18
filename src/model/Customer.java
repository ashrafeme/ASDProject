package model;

import java.util.List;

public class Customer extends Person {
	private List<PhoneNumber> phoneNumbers;
	private List<RentalRecord> rentalRecord;

	public Customer(String fName, String lName, String dob) {
		super(fName, lName, dob);
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
