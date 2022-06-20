package emp_check;

public class Emp_Attendence {

	public static void main(String[] args) {
		int emp_present = 1;
		System.out.println("welcome to employee wage computation");
		double emp_check = Math.floor(Math.random() * 10) % 2;
		if (emp_check == emp_present) {
			System.out.println("The employee is present");

		} else {
			System.out.println("the employee is absent");
		}
	}

}
