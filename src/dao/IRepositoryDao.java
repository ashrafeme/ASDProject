package dao;

import java.sql.SQLException;
import java.util.List;

public interface IRepositoryDao<T> {
	
	public int save(T t)throws SQLException;
	public void update(T t)throws SQLException;
	public void delete(T t)throws SQLException;
	public List<T> getAll(String entityName)throws SQLException;
	public T get(T t)throws SQLException;
}
