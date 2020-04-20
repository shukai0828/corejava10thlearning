package me.shuke.clone;

public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Employee original = new Employee("Jhon", 50000);
			original.setHireDay(2000, 12, 8);
			Employee copy = original.clone();
			copy.raiseSalary(10);
			System.out.println("original=" + original);
			System.out.println("copy=" + copy);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}
