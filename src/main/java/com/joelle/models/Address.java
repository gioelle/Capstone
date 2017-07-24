package com.joelle.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//This class creates the address object to be called by the Customer object
@Entity
@Table(name="address")
public class Address {
	
	private @Id	@GeneratedValue int id;
	@Column
	private String streetAddress;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String zipcode;
	
	//Default Constructor
	public Address (){
	}
	//Parameterized Constructor
	public Address (String streetAddress, String city, String state, String zipcode){
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	

	public String toString(){
		return this.streetAddress + " " + this.city + " " + this.state + " " + this.zipcode;
	}
	
	
	//Getters & setters
	public String getStreetAddress(){
		return this.streetAddress;
	}
	public void setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
	}
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state = state;
	}
	public String getZipcode(){
		return this.zipcode;
	}
	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}
}
