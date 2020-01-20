package org.wmd.dao.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProposedService implements Serializable {

	@Id @GeneratedValue 
	private Long id;
	@Column(length = 30)
	private String name;
	private double price;
	@Column(length = 100)
	private String description;

	public ProposedService() {
		super();
	}

	public ProposedService(String name, String description, double price) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
