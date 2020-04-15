package me.shuke.learnabstract;

public class Student extends Person {
	private String major;
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}
	@Override
	public String getDescprition() {
		// TODO Auto-generated method stub
		return "a student majoring "+this.major;
	}

}
