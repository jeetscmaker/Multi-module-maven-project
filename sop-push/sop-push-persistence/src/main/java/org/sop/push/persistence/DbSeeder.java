package org.sop.push.persistence;

import java.util.ArrayList;
import java.util.List;

import org.sop.push.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner{

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1, "John");
		Employee e2 = new Employee(2, "Bob");
		Employee e3 = new Employee(3, "Sean");
		Employee e4 = new Employee(4, "Brad");
		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		listOfEmployees.add(e3);
		listOfEmployees.add(e4);
		
		this.empRepository.saveAll(listOfEmployees);
		
	}

}
