package calculator;
import java.util.*;
public class Palindrome {
		    static int temp;
			static int rev;
			static int sum=0;
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter NUmber: ");
		        int n = sc.nextInt();
		        temp = n;
		        while(n>0) {
		        rev = n%10;
		        sum = (sum* 10) + rev;
		        n = n/10;
		        }
		        if(temp == sum){
		        System.out.println("It is palindrome");
		        } else {
		            System.out.println("not a palindrome");
		        }

	}

}
