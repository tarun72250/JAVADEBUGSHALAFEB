package basicArrayProgram;

public class A_04_ArrayElementAtEvenPosition {

	public static void main(String[] args) {
		
		int [] even = new int [] {1, 3, 5, 7, 9, 11, 13};

		System.out.println("Array Elements on odd Positions: ");
		    /* Note we are using i = i+2 as we are only traversing odd positions
		     * Important point here is that the array indices start with 0, which
		     * means the odd positions such as 1st, 3rd and 5th positions are having
		     * indices 0, 2, 4 and so on. That's why numbers[0] prints 1st position
		     * element of the array.
		     */
		    for (int i = 0; i < even.length; i = i+2) {
		      System.out.println(even[i]);
		    }

	}

}
