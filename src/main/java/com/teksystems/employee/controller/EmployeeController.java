package com.teksystems.employee.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.teksystems.employee.model.EmployeeModel;
import com.teksystems.employee.service.EmployeeService;




@RestController
class EmployeeController {


@Autowired
EmployeeService service;


	@GetMapping("/employees")
	public List<EmployeeModel> all() {
		return service.all();
	}

	
	@PostMapping("/employees")
	EmployeeModel newEmployee(@RequestBody EmployeeModel newEmployee) {
		return service.newEmployee(newEmployee);
	}

	
	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
		
	}
}
