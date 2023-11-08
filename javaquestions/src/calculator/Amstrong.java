package calculator;

public class Amstrong {
	static int temp , a;
	static int num=153;
	static int sum = 0;

	public static void main(String[] args) {
		temp = num;
		while(num>0) {
			a = num%10;
			sum = sum + (a * a * a);
			num = num/10;
		}
		if ( temp == sum) {
			System.out.println("Amstrong");
		} else {
			System.out.println("Not Amstrong");
		}
		

	}

}
