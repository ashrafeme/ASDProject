package dao;
import java.util.List;

public interface IRentalDao<T> {
	
	public void save(T t);
	public void update(T t);
	public void delete(T t);
	public List<T> getAll();
	public T get(T t);
}
