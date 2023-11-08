package calculator;

public class Factorial {
	static int fact = 1, num = 4;
	

	public static void main(String[] args) {
		for( int i=1; i<=num; i++) {
		fact = fact*i;
		}
		System.out.println(fact);
	}

}
