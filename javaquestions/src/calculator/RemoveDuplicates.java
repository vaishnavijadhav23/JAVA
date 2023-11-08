package calculator;

public class RemoveDuplicates {
//	public static int rdd(int a[]) {
//		int rd = 0;
//		for(int i=1; i<=a.length; i++) {
//			if(a[rd] != a[i]) {
//				rd++;
//				a[rd] = a[i];
//				
//			}
//			
//		}
//		return rd +1;
//	}

	public static int rdd(int a[]) {
	    int rd = 0;
	    for (int i = 1; i < a.length; i++) {
	        if (a[rd] != a[i]) {
	            rd++;
	            a[rd] = a[i];
	        }
	    }
	    return rd + 1;
	}

	public static void main(String[] args) {
		int a[] = {2, 2, 3, 3, 4, 6, 6 };
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		int rd = rdd(a);
		System.out.println();
		for(int i=0; i<rd; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
