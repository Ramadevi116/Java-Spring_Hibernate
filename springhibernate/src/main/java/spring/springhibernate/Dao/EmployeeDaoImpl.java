package spring.springhibernate.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;
import spring.springhibernate.entities.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
@Autowired
	private HibernateTemplate hibernateTemplate;
@Transactional
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(employee);
	}

	
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(employee);
	}

	
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(employee);
	}

	
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Employee.class,id);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Employee.class);
	}

}
