package com.persistmap.entity;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	// ....
	@ElementCollection
	@MapKeyColumn(name = "name")
	@Column(name = "value")
	@CollectionTable(name = "example_attribute", joinColumns = @JoinColumn(name = "example_id"))
	private Map<String, Long> phoneNo;

	public int getUserId() {
		return userId;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, Map<String, Long> phoneNo) {
		super();
		this.userId = userId;
		this.phoneNo = phoneNo;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Map<String, Long> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Map<String, Long> phoneNo) {
		this.phoneNo = phoneNo;
	}

}
