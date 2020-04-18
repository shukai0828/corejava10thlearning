package StaticTest;

class Employee implements Comparable<Employee>{
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
	
	public int compareTo(Employee other) {
		return Double.compare(salary, other.getSalary());
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Tom", 50000);
		System.out.println(e.getName()+" "+e.getSalary());
	}
}