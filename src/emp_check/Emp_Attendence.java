package emp_check;

public class Emp_Attendence {

	public static void main(String[] args) {
		int emp_present = 1;
		int wage_per_hour = 20;
		int full_day_hour = 8;
		int part_time_hour = 4;
		System.out.println("welcome to employee wage computation");
		double emp_check = Math.floor(Math.random() * 10) % 3;
		if (emp_check == emp_present) {
			System.out.println("The employee is present");
			System.out.println("The wage is : " + wage_per_hour * full_day_hour);
		} else if (emp_check == 2) {
			System.out.println("the employee is absent");
		}
		else {
			System.out.println("The employee is part time");
			System.out.println("the employee wage is : " +wage_per_hour*part_time_hour);
		}
	}

}
