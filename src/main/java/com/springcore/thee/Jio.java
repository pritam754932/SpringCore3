package com.springcore.thee;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Jio implements Sim {
	
	
	
	private int data;
	private String name;
	private List<String> fullName;
	private Set<String> rollNo;
private Map<String,String> sub;

Subscription subscription;
	
	public int getData() {
	return data;
}

public void setData(int data) {
	this.data = data;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<String> getFullName() {
	return fullName;
}

public void setFullName(List<String> fullName) {
	this.fullName = fullName;
}

public Set<String> getRollNo() {
	return rollNo;
}

public void setRollNo(Set<String> rollNo) {
	this.rollNo = rollNo;
}

public Map<String, String> getSub() {
	return sub;
}

public void setSub(Map<String, String> sub) {
	this.sub = sub;
}

public Subscription getSubscription() {
	return subscription;
}

public void setSubscription(Subscription subscription) {
	this.subscription = subscription;
}

	
	
	

	public void stateName() {
		System.out.println("Jharkhand");
		
	}

	public void topUpAmount() {
		System.out.println("100");
		
	}

}
