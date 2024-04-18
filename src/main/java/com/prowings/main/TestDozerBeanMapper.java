package com.prowings.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;

import com.prowings.dto.Candidate;
import com.prowings.dto.Employee;
import com.prowings.source.Address;
import com.prowings.source.Person;
import com.prowings.source.Student;

public class TestDozerBeanMapper {
	
	public static void main(String[] args) {
		
		Person person=new Person("Rahul", 27, "Pune", "5.8",1, 1711929600);
		
		Employee employee=new DozerBeanMapper().map(person, Employee.class);
		
//		System.out.println(employee.getAge());
//		System.out.println(employee.getAddress());
//		System.out.println(employee.getHeight());

//		System.out.println(employee.toString());
		
		DozerBeanMapper mapper=new DozerBeanMapper();
		mapper.setMappingFiles(Arrays.asList("dozer_mapping.xml"));
		
		Employee employee2 = mapper.map(person, Employee.class);
		System.out.println(employee2);
		
		Address address1=new Address(123, "Pune", "India");
		Address address2=new Address(123, "Mumbai", "Kolhapur");
		Address address3=new Address(123, "Pune", "India");
		
		List<Address> addresses=new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);
		addresses.add(address3);
		
		
		Student student = new Student(12, "Ram", addresses);
		
		Candidate candidate = mapper.map(student, Candidate.class);
		System.out.println(candidate);
	}

}
