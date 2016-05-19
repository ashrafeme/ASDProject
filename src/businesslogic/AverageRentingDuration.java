package businesslogic;

import model.Car;
import model.IVisitable;

public class AverageRentingDuration implements IItemVisitor {
	private int totalduration = 0;
	private int counter;

	@Override
	public void visit(Car arg0) {
		totalduration += arg0.getRentalPrice();
		++counter;
	}

	@Override
	public void visit(IVisitable item) {

	}

	public long getAverage() {
		return (totalduration);
	}

}
