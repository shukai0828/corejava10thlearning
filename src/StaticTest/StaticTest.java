package StaticTest;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] e = new Employee[3];
		
		e[0] = new Employee("Kate", 60000);
		e[1] = new Employee("Tony", 50000);
		e[2] = new Employee("Jhon", 40000);
		
		for(Employee staff:e) {
			staff.setId();
			
			System.out.println("name="+staff.getName()+", salary="+staff.getSalary()+", id="+staff.getId());
		}
	}

}

class Employee{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
		id = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		id = nextId;
		nextId++;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Tom", 50000);
		System.out.println(e.getName()+" "+e.getSalary());
	}
}