package D5;


 class CheckEqualityofTwoLine {	
	public String LengthofLine(int x1, int y1, int x2, int y2) {
		double lengthOfTheLine = (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		lengthOfTheLine=Math.sqrt(lengthOfTheLine); 
		lengthOfTheLine = Math.floor(lengthOfTheLine);
		return Double.toString(lengthOfTheLine);
	}
 }
	
	
public class LineComparison {

	public static void main(String[] args) {
		CheckEqualityofTwoLine cqotl = new CheckEqualityofTwoLine();
		String lineOne = cqotl.LengthofLine(4, 3, 4, 4);
		String lineTwo = cqotl.LengthofLine(4, 3, 4, 4);
		
		if(lineOne.equals(lineTwo)) 
			System.out.println(lineOne + " is equal to " + lineTwo);
		else
			System.out.println(lineOne + " is not equal to " + lineTwo);
		
		int endPointOne = setEndPoint(4, 3, 2, 4);
		int endPointTwo = setEndPoint(4, 3, 4, 4);
		String ePointOne = Integer.toString(endPointOne);
		String ePointTwo = Integer.toString(endPointTwo);
		if(ePointOne.compareTo(ePointTwo) == 0)
			System.out.println("EndPoint One is equal to EndPoint Two");
		else if(ePointOne.compareTo(ePointTwo) < 0)
			System.out.println("EndPoint One is less than EndPoint Two");
		else
			System.out.println("EndPoint One is greater than EndPoint Two");	
	}

	public static int setEndPoint(int x1, int y1, int x2, int y2) {
		return (x2+y2);
	}
	
}
