package codility;

import java.util.Arrays;

/**
 * https://codility.com/demo/take-sample-test/triangle/
 *
 * @author Ritaja Sengupta
 * @since 22/01/16
 */
public class Traingle {
	public int solution(int[] A) {
		// write your code in Java SE 8
		// Handle with the special cases
		if(null == A || A.length < 3) return 0;

		// Sort the input, and then try to find the triangular
		Arrays.sort(A);
		for(int i = 0; i < A.length-2; i++) {
			// Beware of overflow
			if (A[i] >= 0 && A[i] > A[i+2] - A[i+1]) {
				return 1;
			}
            /*
             * We already know A[i+1] <= A[i+2]. If A[i] < 0,
             * A[i] + A[i+1] < A[i+2]
             */
		}
		return 0;
	}

	public static void main(String[] args) {
		Traingle m = new Traingle();
		System.out.println(m.solution(new int[]{0, 1, 0, 1, 1}));
	}
}
