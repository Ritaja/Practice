package main.java.codility; /**
 * Copyright(c) 2009-2016 optile GmbH. All Rights Reserved
 * https://www.optile.net
 *
 * This software is the property of optile GmbH. Distribution
 * of this software without agreement in writing is strictly prohibited.
 *
 * This software may not be copied, used or distributed unless agreement
 * has been received in full.
 */

/**
 * Programming language
 * Task description
 * A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
 *
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 *
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 *
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 *
 * For example, consider array A such that:
 *
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * We can split this tape in four places:
 *
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * Write a function:
 *
 * int solution(int A[], int N);
 *
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
 *
 * For example, given:
 *
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * the function should return 1, as explained above.
 *
 * Assume that:
 *
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 * Complexity:
 *
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 *
 * @author Ritaja Sengupta
 * @since 20/01/16
 */
public class TapeEquilibrium {
	public int solution(int[] A) {
		// write your code in Java SE 8
		// store the sum
		int[] B = A.clone();
		int cum = 0;
		int i = 0;
		for (int num : A) {
			cum += num;
			B[i++]=cum;
		}
		cum = Math.abs(B[0]-(B[A.length-1]-B[0]));
		for (i = 1; i < A.length; i++) {
			int dif = Math.abs(B[i]-(B[A.length-1]-B[i]));
			if (dif < cum) {
				cum = dif;
			}
		}
		return cum;
	}

	public static void main(String[] args) {
		TapeEquilibrium m = new TapeEquilibrium();
		System.out.println(m.solution(new int[]{1,2000}));
	}
}