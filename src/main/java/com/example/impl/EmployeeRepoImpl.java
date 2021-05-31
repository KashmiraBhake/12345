package com.example.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.example.bean.Employee;
import com.example.repo.EmployeeRepo;
@Service
public class EmployeeRepoImpl implements EmployeeRepo 
{
	@Autowired
	private MongoTemplate mongotemplate;
	
															//Save Employee Record
	@Override
	public <S extends Employee> S save(S entity) 
	{
		return mongotemplate.save(entity);
	}
															//Display All Employee Record
	@Override
	public List<Employee> findAll() 
	{
		return mongotemplate.findAll(Employee.class);
	}
															//Update Employee Record Method-2
	public Employee update(Employee e)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(e.getId()));
		Update update = new Update();
		update.set("Empname", e.getEmpname());
		update.set("Address", e.getAddress());
		update.set("Gender", e.getGender());
		return mongotemplate.findAndModify(query, update, Employee.class);
	}
															//Delete Employee Record By ID
	@Override
	public void deleteById(String id) 
	{	
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		mongotemplate.remove(query, Employee.class);
	}
															//Search Record By EmpId
	public List findByEmpid(String empid)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("empid").is(empid));
		return mongotemplate.find(query, Employee.class);
	}
															//Search Record By Empname
	public List findByEmpname(String empname)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("empname").is(empname));
		return mongotemplate.find(query, Employee.class);
	}
															//Search Record By Address
	public List findByAddress(String address)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("address").is(address));
		return mongotemplate.find(query, Employee.class);
	}
															//Search Record By Gender
	public List findByGender(String gender)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("gender").is(gender));
		return mongotemplate.find(query, Employee.class);
	}	
															//Delete All Record
	@Override
	public void deleteAll() 
	{
		mongotemplate.dropCollection(Employee.class);
	}

	@Override
	public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Employee> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Employee> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Employee> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void delete(Employee entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Employee> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Employee> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Employee> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}	
}
