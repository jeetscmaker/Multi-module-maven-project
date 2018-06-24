package org.sop.push.web;

import java.util.List;

import org.sop.push.domain.Employee;
import org.sop.push.persistence.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private EmployeeRepository empRepo;

	@ResponseBody
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		List<Employee> listOfEmployees = empRepo.findAll();
		return listOfEmployees;
	}
	
}
