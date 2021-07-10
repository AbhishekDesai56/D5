package D5;

public class EmoloyeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isPresent = (int) (Math.floor(Math.random() * 10) % 2);
		if (isPresent == 0)
			System.out.println("Employee is absent");
		else
			System.out.println("Employee is present");
		
	}

}
