package model;

public class PhoneNumber {
	private String countryCode;
	private String number;
	private boolean isPrimary = false ;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public PhoneNumber(String number) {
		this("+1", number);
	}

	public PhoneNumber(String countryCode, String number) {
		this.countryCode = countryCode;
		this.number = number;
	}
	
	public void setPrimary(boolean isPrimary){
		this.isPrimary = isPrimary;
	}
	
	public boolean isPrimary(){
		return this.isPrimary;
	}
	
	public void addPhoneNumber(String countryCode,String number){
		this.setCountryCode(countryCode);
		this.setNumber(number);
	}

}
