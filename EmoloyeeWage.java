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
		}
			
		if(isPresent == 1)
		{
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case isFullTime:
				empHrs = 8;
				break;
			case isPartTime:
				empHrs = 4;
			default:
				break;
			}
		}
		int empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage: " + empWage);
	}
}
