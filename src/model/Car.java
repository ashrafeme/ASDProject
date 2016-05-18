package model;
import businesslogic.IItemVisitor;
import model.IVisitable;

public class Car implements IVisitable {
	private double rentalPrice;
	private String code;
	private boolean available;
	private int stock;

	public Car(double rentalPrice, String code,
			boolean available, int stock) {
		this.rentalPrice = rentalPrice;
		this.code = code;
		this.available = available;
		this.stock = stock;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}

	public String getCode() {
		return code;
	}

	public boolean isAvailable() {
		return available;
	}

	public int getStock() {
		return stock;
	}

	@Override
	public void accept(IItemVisitor arg0) {
		arg0.visit(this);
	}
}
