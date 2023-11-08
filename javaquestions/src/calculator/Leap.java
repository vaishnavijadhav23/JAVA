package calculator;

public class Leap {
static int num = 2000;
	public static void main(String[] args) {
		
		if((num%400 == 0) || (num%100 != 0 && num%4 == 0 )) {
			System.out.println("Year is Leap");
		} else {
			System.out.println("Not a Leap Year");
		}
	

	}

}
