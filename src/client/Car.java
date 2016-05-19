package client;

import model.Item;

public class Car extends Item {
	private String make;
	private String color;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car(String itemName, double rentalPrice, String code,
			boolean available, int stock,int duration) {
		super(itemName, rentalPrice, code, available, stock,duration);
	}

}
