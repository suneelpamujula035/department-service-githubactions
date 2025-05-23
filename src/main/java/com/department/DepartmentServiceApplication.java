package com.department;

import com.department.entity.Department;
import com.department.repository.DepartmentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DepartmentServiceApplication {

	@Autowired
	private DepartmentRepository repository;

	@PostConstruct
	public void initDB(){
		List<Department> departments = Stream.of(
				new Department("Computer Science","CSE", "This is CSE department"),
				new Department("Electronics Engineering","ECE", "This is ECE department")
		).collect(Collectors.toList());
		repository.saveAll(departments);
	}
	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
