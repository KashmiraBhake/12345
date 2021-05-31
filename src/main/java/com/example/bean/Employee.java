package com.example.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="EmployeeRecord")
public class Employee 
{
	@Id
	private String id;
	
	@Indexed(unique = true)
	@Field(value="Empid")
	private String empid;
	@Field(value="Empname")
	private String empname;
	@Field(value="Address")
	private String address;
	@Field(value="Gender")
	private String gender;
	
	public Employee() {
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empid=" + empid + ", empname=" + empname + ", address=" + address + ", gender="
				+ gender + "]";
	}	
}
