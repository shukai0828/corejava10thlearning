package StaticTest;

import java.util.Arrays;

public class InterfaceTest {

	public static void main(String[] args) {
		Employee[] e = new Employee[3];
		
		e[0] = new Employee("Mike", 30000);
		e[1] = new Employee("Tony", 50000);
		e[2] = new Employee("Jhon", 40000);
		
		Arrays.sort(e);
		
		for(Employee staff:e) {
			staff.setId();
			
			System.out.println("name="+staff.getName()+", salary="+staff.getSalary()+", id="+staff.getId());
		}
	}

}
