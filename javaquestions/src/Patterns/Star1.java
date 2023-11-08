package Patterns;

public class Star1 {
	static int n=4;
	public static void main(String[] args) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
