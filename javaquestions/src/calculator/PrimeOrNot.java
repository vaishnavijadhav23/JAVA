package calculator;
import java.util.Scanner;
public class PrimeOrNot {
//	static int num;
//	static boolean isPrime = true;
	
	public static boolean P(int n) {
		for(int i=2; i<=n-1; i++) {
			if (n%2==0) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number: ");
//		 num = sc.nextInt();
//		 
//		 for(int i=2; i<=num/2; i++) {
//			 if(num%2 == 0) {
//				isPrime = false;
//				break;
//			 }
//		 }
//		 if(isPrime) {
//			 System.out.println("number is Prime");
//		 } else {
//			 System.out.println("Not a prime number");
//		 }
		System.out.println(P(5));
		
	
	
	}
}

