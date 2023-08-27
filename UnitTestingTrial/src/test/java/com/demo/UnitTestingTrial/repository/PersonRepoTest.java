package com.demo.UnitTestingTrial.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.UnitTestingTrial.entity.Person;


@SpringBootTest
class PersonRepoTest {
	
	@Autowired
	private PersonRepo personRepo;
	
	@Test
	public void testCreatePerson() {
		Person person  =new Person(102,"Prajakta Mali","Pune");
		Person savedProduct = personRepo.save(person);
		assertNotNull(savedProduct);
	}

//	@Test
//	void testFindAll() {
//		Person person = new Person(101,"Pratik Patil","Jalgaon");
//		
//		personRepo.save(person);
//		
//		Boolean actualResult = personRepo.existsById(101);
//		
//		assertThat(actualResult).isTrue();
//	}
//	
//	@AfterEach
//	void tearDown() {
//		System.out.println("Tearing down");
//		personRepo.deleteAll();
//	}
//	
//	@BeforeEach
//	void setUp() {
//		System.out.println("Setting up");
//	}
//	

}
