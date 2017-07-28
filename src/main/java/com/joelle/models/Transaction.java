package com.joelle.models;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	
	private @Id @GeneratedValue int id;
	@Column
	private Date date;
	@Column
	private int value;
	@Column
	private String user;
	@Column
	private String title;
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Transaction(int amount, String user) {
		this.date = Calendar.getInstance().getTime();
	}

	
	public String toString() {
		return  "*" + date + "," + value + "," + user;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
