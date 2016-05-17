package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RepositoryDaoImpl<T> implements IRepositoryDao<T> {

	@Override
	public void save(T t)  {

	}

	@Override
	public void update(T t) {
	}

	@Override
	public void delete(T t) {

	}

	@Override
	public List<T> getAll() {

		return null;
	}

	@Override
	public T get(T t) {
		return null;
	}

}
