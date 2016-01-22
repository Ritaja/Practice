package codility;

import java.util.Arrays;

/**
 * Write a function:
 *
 * https://codility.com/programmers/task/missing_integer/
 *
 * @author Ritaja Sengupta
 * @since 21/01/16
 */
public class MissingInteger {
	public int solution(int[] A) {
		// write your code in Java SE 8
		if (A.length == 0) {
			return 1;
		} else if (A.length == 1) {
			return 1;
		}
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				if (A[i] != A[i + 1] && A[i] != A[i + 1] - 1)
					return A[i] + 1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		MissingInteger m = new MissingInteger();
		System.out.println(m.solution(new int[]{6, 3, 2, 4, 1, 3, 6, 4}));
	}
}
