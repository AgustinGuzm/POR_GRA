package weekTwo;
/**
 * Recursive Multiply: Write a recursive function to multiply two positive integers 
 * without using the *operator. You can use addition, subtraction, and bit shifting, 
 * but you should minimize the number of those operations.
 * 
 *
 */
public class RecurMult {
	public static int result =0;
	public static void RecursiveMultiplic(int N, int M, int i) {
		if (i <= M) {
			result += N;
			i++;
			RecursiveMultiplic(N,M,i);
		}
			
	}
	
	
	

}
