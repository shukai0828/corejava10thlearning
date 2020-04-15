package me.shuke.learnabstract;

public abstract class Person {
	public abstract String getDescprition();
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
