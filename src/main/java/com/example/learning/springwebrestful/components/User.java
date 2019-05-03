package com.example.learning.springwebrestful.components;

public class User {
private Integer id;
private String name;
private String dept;

protected User() {
}

public User(Integer id, String name, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
}


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", dept=" + dept + "]";
}

}
