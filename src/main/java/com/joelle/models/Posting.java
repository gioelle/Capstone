package com.joelle.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="posting")
public class Posting {
	
	private @Id	@GeneratedValue int id;
	@Column
	private String type;
	@Column
	private String title;
	@Column
	private int value;
	@Column
	private String description;
	@Column
	private int instances;
	@OneToMany
	private ImageFiles imageFiles;
	
	//private ArrayList<ImageFiles> images = new ArrayList<ImageFiles>();
	
	//default constructor
	public Posting () {}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getInstances() {
		return instances;
	}
	public void setInstances(int instances) {
		this.instances = instances;
	}
//	public ArrayList<String> getImages() {
//		return images;
//	}
//	public void setImages(ArrayList<String> images) {
//		this.images = images;
//	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
}
