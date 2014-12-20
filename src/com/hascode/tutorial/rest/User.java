package com.hascode.tutorial.rest;
 
 

import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class User {
	private String id;
	private String firstName;
	private String lastName;
	private String name;
//	private Date birthday;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
//	public Date getBirthday() {
	//	return birthday;
	//}
	//public void setBirthday(Date birthday) {
	//	this.birthday = birthday;
	//}
	
	
	public String getId(){
		return id; 
	}
	public void setId(String id){
		this.id=id;
	}
	
}