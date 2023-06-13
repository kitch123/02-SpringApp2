package com.rktech.spring.beans;

public class Demo {
	
	private String topicName;
	
	public Demo() {
		System.out.println("Spring Bean Demo Class...");
	}
	
	public Demo(String topicName) {
		this.topicName=topicName;
	}

	@Override
	public String toString() {
		return "Demo [topicName=" + topicName + "]";
	}
	
     
}
