package dao;

import java.util.Arrays;
import java.util.List;

public class RentalDaoImpl<T> implements IRentalDao<T> {
	T dataSource;

	public void setDataSource(T dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void save(T t) {
		System.out.println("Saved " + t.getClass().getName() + "Successfully");
	}

	@Override
	public void update(T t) {
		System.out
				.println("updated " + t.getClass().getName() + "Successfully");
	}

	@Override
	public void delete(T t) {
		System.out
				.println("Deleted " + t.getClass().getName() + "Successfully");
	}

	@Override
	public List<T> getAll() {

		System.out.println("Getting all items");
		return (List<T>) Arrays
				.asList(new Object(), new Object(), new Object());
	}

	@Override
	public T get(T t) {
		System.out.println("Getting Item " + t.getClass().getName());
		return t;
	}

}
