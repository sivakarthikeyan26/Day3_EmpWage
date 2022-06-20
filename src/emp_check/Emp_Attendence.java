package emp_check;

public class Emp_Attendence {

	public static void main(String[] args) {
		int wage_per_hour = 20;
		int full_day_hour = 8;
		int part_time_hour = 4;
		int day_count=1;
		int hour_count=0;
		System.out.println("welcome to employee wage computation");
		while (day_count !=20 && hour_count != 100) {
		int emp_check = (int) (Math.floor(Math.random() * 10) % 3);
		switch (emp_check) {
		case 1:
			day_count += 1;
			hour_count += full_day_hour;
			break;
		case 2:
			day_count += 1;
			hour_count += part_time_hour;
			break;
		default:
			continue;
		}
		}
		System.out.println("The employee wage is : " +wage_per_hour*hour_count*day_count);
	}
}
