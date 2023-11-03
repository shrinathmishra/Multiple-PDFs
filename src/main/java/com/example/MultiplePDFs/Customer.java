package com.example.MultiplePDFs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String NAME;
    private String MOBILENUMBER;
	public Long getId() {
		return ID;
	}
	public void setId(Long id) {
		this.ID = id;
	}
	public String getName() {
		return NAME;
	}
	public void setName(String name) {
		this.NAME = name;
	}
	public String getMobileNumber() {
		return MOBILENUMBER;
	}
	public void setMobileNumber(String mobileNumber) {
		this.MOBILENUMBER = mobileNumber;
	}

    // Getters and setters
    
}