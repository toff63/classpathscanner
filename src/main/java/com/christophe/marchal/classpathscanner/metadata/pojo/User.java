package com.christophe.marchal.classpathscanner.metadata.pojo;

import com.christophe.marchal.classpathscanner.metadata.annotation.XmlFieldMapping;
import com.christophe.marchal.classpathscanner.metadata.annotation.XmlMapping;


@XmlMapping
public class User {

	@XmlFieldMapping(xmlField="user")
	private String username;
	
	@XmlFieldMapping(xmlField="name")
	private String firstName;
	
	@XmlFieldMapping
	private String lastName;
	
	@XmlFieldMapping
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
