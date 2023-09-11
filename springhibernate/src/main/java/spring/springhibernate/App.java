package spring.springhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.springhibernate.business.EmployeeBusiness;
import spring.springhibernate.business.EmployeeBusinessImpl;
import spring.springhibernate.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
        EmployeeBusiness employeeBusiness=(EmployeeBusinessImpl) applicationContext.getBean("EmployeeBusinessImpl");
        Employee employee=new Employee();
        employee.setAddress("Rajampet");
        employee.setContact("999999999");
        employee.setExp(15);
        employee.setName("Ramadevi");
        employee.setId(1);
        
        employeeBusiness.save(employee);
    }
}
