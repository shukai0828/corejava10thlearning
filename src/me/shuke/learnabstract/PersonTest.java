package me.shuke.learnabstract;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people = new Person[2];
		
		people[0] = new Employee("Jhon",8000,2020,12,8);
		people[1] = new Student("Tony", "Computer Science");
		
		for(Person p:people) {
			System.out.println(p.getName()+", "+p.getDescprition());
		}
	}

}
