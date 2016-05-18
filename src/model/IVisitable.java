package model;

public interface IVisitable {
	//public void accept(Visitor visitor);
	public void addItem(Item item);
	public boolean deleteItem(Item item);
	public boolean updateItem(Item item);
}
