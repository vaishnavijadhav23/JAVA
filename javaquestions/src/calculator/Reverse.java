package calculator;

import java.util.Scanner;

public class Reverse {
	static int rev;
	static int sum=0;
	static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUmber: ");
        int num = sc.nextInt();
        
        while(num>0) {
        	rev = num%10;
        	sum = (sum*10) +rev;
        	num = num/10;
        }
        System.out.println(sum);
    }

}
