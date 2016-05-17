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
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	  Session session = factory.openSession();

	@Override
	public int save(T t) throws SQLException {
		Session session = factory.openSession();
	      Transaction tx = null;
	      Integer id = null;
	      try{
	         tx = session.beginTransaction();

	         id = (Integer) session.save(t); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return id;

	}

	@Override
	public void update(T t) throws SQLException {
		Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();

	       session.update(t);
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	}

	@Override
	public void delete(T t) {
		Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();

	       session.delete(t);
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll(String entityName) {
		Session session = factory.openSession();
		  List<T> list = null;
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();

	        list= session.createQuery("FROM "+entityName).list();
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return list;
	}

	@Override
	public T get(T t) {
	return null;
	}

}
