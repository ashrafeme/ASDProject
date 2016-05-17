package dao;

import java.util.List;

import model.Employee;

public interface IEmployeeDao {
	public Employee getEmployee(Employee employee);

	public Employee registerEmployee(Employee employee);

	public List<Employee> getEmployee();
}
