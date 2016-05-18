package businesslogic;

import model.Car;
import model.IVisitable;

public interface IItemVisitor {
	void visit(Car a);
	void visit(IVisitable item);
}
