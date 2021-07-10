package D5;

public class LineComparison {

	public static void main(String[] args) {
		int x1=3, y1=4, x2=4, y2=3;
		double lengthOfTheLine = (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		lengthOfTheLine=Math.sqrt(lengthOfTheLine); 
		System.out.println("Length of the Line:" +lengthOfTheLine);
	}

}
