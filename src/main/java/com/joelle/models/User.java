package com.joelle.models;


import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private Address address;
	@Column
	private String profilePic; 
	@Column
	private int swaPointsBalance;
	@Column
	private double rating;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();	
	private ArrayList<Posting> postings = new ArrayList<Posting>();
	
	
	//default constructor
	public User() {}
	//parameterized constructor
	
	public User(String firstName, String lastName, String email, String password, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public int getSwaPointsBalance() {
		return swaPointsBalance;
	}

	public void setSwaPointsBalance(int swaPointsBalance) {
		this.swaPointsBalance = swaPointsBalance;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ArrayList<Posting> getPostings() {
		return postings;
	}

	public void setPostings(ArrayList<Posting> postings) {
		this.postings = postings;
	}


}
