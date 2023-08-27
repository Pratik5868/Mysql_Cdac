package com.demo.UnitTestingTrial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.UnitTestingTrial.entity.Person;
import com.demo.UnitTestingTrial.repository.PersonRepo;


@Service
public class PersonService {
	
	@Autowired
	private PersonRepo repo;

	public List<Person> getAllPerson() {
		
		return this.repo.findAll();
	}

	

}
