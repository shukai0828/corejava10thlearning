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
		System.out.println("*****");
		
		Employee.swap(e[0], e[1]);
		
		System.out.println("*****");
		
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
	
	public void raiseSalary(int byPercent) {
		double x = salary * byPercent / 100;
		salary += x;
	}
	
	public static void tripleSalary(Employee x) {
		x.raiseSalary(200);
	}
	
	public static void swap(Employee x, Employee y) {
		Employee tmp;
		tmp = x;
		x = y;
		y = tmp;
		
		Employee.tripleSalary(x);
		Employee.tripleSalary(y);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Tom", 50000);
		tripleSalary(e);
		System.out.println(e.getName()+" "+e.getSalary());
	}
}