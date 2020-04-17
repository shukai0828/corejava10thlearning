package me.shuke.learnabstract;

import java.time.*;

public class Employee extends Person {

	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n, double s, int year, int month, int day) {
		super(n);
		this.salary = s;
		this.hireDay = LocalDate.of(year, month, day);
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	@Override
	public String getDescprition() {
		// TODO Auto-generated method stub
		return String.format("an employee with salary %.2f", salary);
	}
}
