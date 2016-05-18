package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends Person {
	private List<PhoneNumber> phoneNumbers;
	private List<RentalRecord> rentalRecord;

	public Customer(String firstName, String lastName, Date dateOfBirth) {
		super(firstName, lastName, dateOfBirth);
		this.phoneNumbers = new ArrayList<PhoneNumber>();
		this.rentalRecord = new ArrayList<RentalRecord>();
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

	/**
	 * Add a new PhoneNumber to the list of Customer's PhoneNumbers
	 * @param phoneNumber
	 */
	public void addPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumbers.add(phoneNumber);
	}

	/**
	 * Search throughout the phone numbers and returns the first found and
	 * marked as primary
	 * 
	 * @return PhoneNumber
	 */
	public PhoneNumber getPrimaryPhoneNumber() {

		for (PhoneNumber pn : this.phoneNumbers) {
			if (pn.isPrimary()) {
				return pn;
			}
		}

		return null;

	}

	
	/**
	 * Get the full list of Customer's RentalRecords
	 * @return List<RentalRecord>
	 */
	public List<RentalRecord> getRentalHistory() {
		return rentalRecord;
	}

	public void addRentalRecord(RentalRecord rentalRecord) {
		this.rentalRecord.add(rentalRecord);
	}

}
