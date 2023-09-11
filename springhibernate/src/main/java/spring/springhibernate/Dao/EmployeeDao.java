package spring.springhibernate.Dao;

import java.util.List;

import spring.springhibernate.entities.Employee;

public interface EmployeeDao {
	public void save(Employee employee);
	public void update(Employee employee);
	public void delete(Employee employee);
	public Employee findById(int id);
	public List<Employee> findAll(); 
	

}
