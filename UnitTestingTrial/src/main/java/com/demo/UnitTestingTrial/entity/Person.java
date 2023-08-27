package com.demo.UnitTestingTrial.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Person {
	
	@Id
	private Integer personId;
	private String personName;
	private String personCity;
	
	
	public Person() {
	
	}
	public Person(Integer personId, String personName, String personCity) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personCity = personCity;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personCity=" + personCity + "]";
	}
	
	
	

}
