package com.demo.UnitTestingTrial.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.UnitTestingTrial.entity.Person;
import com.demo.UnitTestingTrial.services.PersonService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@Operation(summary = "This is a controller to get all the person data")
	@ApiResponses({
		@ApiResponse(responseCode = "200",description = "Fetched all the books from Database"),
		@ApiResponse(responseCode = "404",description = "Not available")
	})
	@GetMapping("person")
	public List<Person> getAllPerson(){
		return this.personService.getAllPerson();
	}

}
