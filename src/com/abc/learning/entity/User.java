package com.abc.learning.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usertable")
public class User {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "country")
	private String country;

	@Column(name = "age")
	private int age;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "gender")
	private String gender;

	public User() {

	}

	public User(int id, String name, String country, int age, String mobile, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.age = age;
		this.mobile = mobile;
		this.gender = gender;
	}

	public User(String name, String country, int age, String mobile, String gender) {
		this.name = name;
		this.country = country;
		this.age = age;
		this.mobile = mobile;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", country=" + country + ", age=" + age + ", mobile=" + mobile
				+ ", gender=" + gender + "]";
	}

}
