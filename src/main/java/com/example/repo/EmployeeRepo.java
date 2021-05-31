package com.example.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.bean.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, String> 
{

}
