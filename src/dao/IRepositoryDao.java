package dao;
import java.util.List;

public interface IRepositoryDao<T> {
	
	public void save(T t);
	public void update(T t);
	public void delete(T t);
	public List<T> getAll();
	public T get(T t);
}
