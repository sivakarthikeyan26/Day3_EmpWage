package emp_check;

public class Emp_Attendence {

	public static void main(String[] args) {
		int emp_present = 1;
		int wage_per_hour = 20;
		int full_day_hour = 8;
		int part_time_hour = 4;
		int month = 20;
		System.out.println("welcome to employee wage computation");
		int emp_check = (int) (Math.floor(Math.random() * 10) % 3);
		if (emp_check == emp_present) {
			System.out.println("The employee is present");
			System.out.println("The wage is : " + wage_per_hour * full_day_hour);
		} else if (emp_check == 2) {
			System.out.println("The employee is part time");
			System.out.println("the employee wage is : " +wage_per_hour*part_time_hour);
		}
		else {
			System.out.println("the employee is absent");
		}
		switch (emp_check) {
		case 1:
			System.out.println("The employee is present");
			System.out.println("The wage for the month is : " + wage_per_hour * full_day_hour * month);
			break;
		case 2:
			System.out.println("The employee is present part time");
			System.out.println("The wage for the month is : " + wage_per_hour * part_time_hour * month);
			break;
		default:
			System.out.println("the employee is absent");
		}
	}

}
