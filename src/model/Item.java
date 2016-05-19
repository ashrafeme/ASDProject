package model;

import businesslogic.IItemVisitor;

public class Item implements IVisitable, IItem {
	private String ItemName;
	private double rentalPrice;
	private String code;
	private boolean available;
	private int stock;
	private int rentalDuration;

	public Item(String itemName, double rentalPrice, String code,
			boolean available, int stock,int duration) {
		super();
		ItemName = itemName;
		this.rentalPrice = rentalPrice;
		this.code = code;
		this.available = available;
		this.stock = stock;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public String getItemName() {
		return ItemName;
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
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteItem(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateItem(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void accept(IItemVisitor visitor) {
		// TODO Auto-generated method stub
		
	}
}
