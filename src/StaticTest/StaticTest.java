package StaticTest;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager boss = new Manager("Carl", 80000);
		boss.setBonus(5000);
		Employee[] e = new Employee[3];
		
		e[0] = boss;
		e[1] = new Employee("Tony", 50000);
		e[2] = new Employee("Jhon", 40000);
		
		for(Employee staff:e) {
			staff.setId();
			
			System.out.println("name="+staff.getName()+", salary="+staff.getSalary()+", id="+staff.getId());
		}
	}

}
