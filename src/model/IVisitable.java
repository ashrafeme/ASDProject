package model;

import businesslogic.IItemVisitor;

public interface IVisitable {
	public void accept(IItemVisitor visitor);
}
