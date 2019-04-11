package com.teksystems.employee.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.teksystems.employee.model.EmployeeModel;
import com.teksystems.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	public List<EmployeeModel> all() {
		return repository.findAll();
	}

	public EmployeeModel newEmployee(@RequestBody EmployeeModel newEmployee) {
		return repository.save(newEmployee);
	}

	public void deleteEmployee(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
