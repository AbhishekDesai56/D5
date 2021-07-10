package D5;

class ComparisonCheck {
	public String lengthOfLine(int x1, int y1, int x2, int y2) {
		double lengthOfTheLine = (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		lengthOfTheLine=Math.sqrt(lengthOfTheLine); 
		lengthOfTheLine = Math.floor(lengthOfTheLine);
		return Double.toString(lengthOfTheLine);
	}
	
	public int compareEndPoint(int x1, int y1, int x2, int y2) {
		return (x2+y2);
	}
	
	public void displayLengthOftheLine(String lineOne, String lineTwo) {
		if(lineOne.equals(lineTwo)) 
			System.out.println(lineOne + " is equal to " + lineTwo);
		else
			System.out.println(lineOne + " is not equal to " + lineTwo);
	}
	
	public void displayCompareEndPoint(int endPointOne, int endPointTwo) {
		String ePointOne = Integer.toString(endPointOne);
		String ePointTwo = Integer.toString(endPointTwo);
		if(ePointOne.compareTo(ePointTwo) == 0)
			System.out.println("EndPoint One(" + ePointOne + ") is equal to EndPoint Two(" + ePointTwo + ")");
		else if(ePointOne.compareTo(ePointTwo) < 0)
			System.out.println("EndPoint One(" + ePointOne + ") is less than EndPoint Two(" + ePointTwo + ")");
		else
			System.out.println("EndPoint One(" + ePointOne + ") is greater than EndPoint Two(" + ePointTwo + ")");	
	}
}

public class LineComparison {
	public static void main(String[] args) {
		ComparisonCheck cqotl = new ComparisonCheck();
		
		System.out.println("Check Equality Of Two Line: ");
		String lineOne = cqotl.lengthOfLine(4, 3, 4, 4);
		String lineTwo = cqotl.lengthOfLine(4, 3, 4, 4);
		cqotl.displayLengthOftheLine(lineOne, lineTwo);
		
		System.out.println();
		
		System.out.println("Comparing two line based on the end points: ");
		int endPointOne = cqotl.compareEndPoint(4, 3, 2, 4);
		int endPointTwo = cqotl.compareEndPoint(4, 3, 4, 4);
		cqotl.displayCompareEndPoint(endPointOne, endPointTwo);	
	}
}
