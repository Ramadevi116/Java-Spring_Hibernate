package spring.springhibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")

public class Employee {
	@Id
	private int id;
	@Column(name="name")
	private String name;
	private String address;
	private String contact;
	private int exp;
	
	public Employee(int id, String name, String address, String contact, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.exp = exp;
	}
	public Employee(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	

}
