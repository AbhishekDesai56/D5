package D5;

class Employee
{
	public final static int isFullTime = 1;
	public final static int isPartTime = 2;
	public final static int EMP_RATE_PER_HOUR = 20; 
	public final static int NUMBER_OF_WORKING_DAYS = 20;
	public final static int MAX_HRS_IN_MONTH = 100;
	public final static int PART_TIME_HOURS = 4;
	public final static int FULL_TIME_HOURS = 8;
    static int empHrs;
    static int totalWorkingDays = 0, totalEmpWage = 0, totalEmpHrs = 0;
    
    public void empWageCalc() {
    	int empPresent = (int) (Math.floor(Math.random() * 10) % 2);
    	boolean isPresent = (empPresent == 1) ? true : false;
		if (isPresent) {
			System.out.println("Employee is absent");
			return;
		} else {
			System.out.println("Employee is present");
		}
		
		while(totalEmpHrs <= MAX_HRS_IN_MONTH &&
				totalWorkingDays < NUMBER_OF_WORKING_DAYS) {
				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				int empHrs = getWorkingHours(empCheck);
				totalEmpHrs += empHrs;
		}
	
		totalEmpWage = calcDailyWage(totalEmpHrs);
		System.out.println("Total Employee Hours: " + totalEmpHrs);
		System.out.println("Total Employee Wage: " + totalEmpWage);
    }
    
	public int calcDailyWage(int empHrs) {
		return empHrs * EMP_RATE_PER_HOUR;
	}
	
	public  int getWorkingHours(int empCheck) {
		switch (empCheck) {
			case isPartTime:
				return PART_TIME_HOURS;
			case isFullTime:
				return FULL_TIME_HOURS;
			default:
				return 0;
		}
	}
}

public class EmoloyeeWage {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empWageCalc();
	}
}


