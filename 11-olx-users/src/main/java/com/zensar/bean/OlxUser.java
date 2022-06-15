package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class OlxUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String userName;
private String password;
private String roles;
private String active;
private String firstname;
private String lastname;
private String email;
private String phone;


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRoles() {
	return roles;
}
public void setRoles(String roles) {
	this.roles = roles;
}
public String getActive() {
	return active;
}
public void setActive(String active) {
	this.active = active;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;


}@Override
public String toString() {
	return "OlxUser [id=" + id + ", username=" + userName + ", password=" + password + ", roles=" + roles + ", active="
			+ active + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phone=" + phone
			+ "]";
}
}