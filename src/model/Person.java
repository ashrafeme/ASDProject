package model;

public abstract class Person {

	private String fName;
	private String lName;
	private String dob;

	public Person(String fName, String lName, String dob) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
}
