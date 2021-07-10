package D5;

public class EmoloyeeWage {
	public final static int isFullTime = 1;
	public final static int isPartTime = 2;
	public final static int EMP_RATE_PER_HOUR = 20; 
    static int empHrs;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isPresent = (int) (Math.floor(Math.random() * 10) % 2);
		if (isPresent == 0) {
			System.out.println("Employee is absent");
		} else {
			System.out.println("Employee is present");
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			if (empCheck  == isFullTime) {
				System.out.println("Full Time Employee");
				empHrs = 8;
			} else if(empCheck == isPartTime) {
				System.out.println("Part Time Employee");
				empHrs = 4;
			}	
		}
		int empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage: " + empWage);
	}
}
