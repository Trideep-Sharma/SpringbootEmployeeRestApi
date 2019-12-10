package com.trideep.employee.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.trideep.employee.model.Employee;

@Repository
public interface Employeedao extends MongoRepository<Employee, Integer> {

}
