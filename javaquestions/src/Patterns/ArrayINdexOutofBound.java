package Patterns;

public class ArrayINdexOutofBound {
	public static class ArrayIndexOutOfBoundsExceptionExample {
	    public static void main(String[] args) {
	        try {
	            int[] array = {1, 2, 3, 4, 5, 6 };
	            
	            // Trying to access an element outside the valid range
	            int element = array[7]; // This will throw ArrayIndexOutOfBoundsException
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("An ArrayIndexOutOfBoundsException occurred.");
	            System.out.println("Exception message: " + e.getMessage());
	        }
	    }
	}


}
