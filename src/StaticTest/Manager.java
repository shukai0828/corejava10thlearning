package StaticTest;

public class Manager extends Employee {

	private double bonus;
	public Manager(String n, double s) {
		super(n, s);
		// TODO Auto-generated constructor stub
		bonus = 0;
	}

	public void setBonus(double b) {
		this.bonus = b;
	}
	
	public double getSalary() {
		return bonus + super.getSalary();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
