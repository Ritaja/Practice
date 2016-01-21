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

import java.util.Arrays;

/**
 * Write a function:
 *
 * int solution(int A[], int N);
 *
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.
 *
 * For example, given:
 *
 * A[0] = 1
 * A[1] = 3
 * A[2] = 6
 * A[3] = 4
 * A[4] = 1
 * A[5] = 2
 * the function should return 5.
 *
 * Assume that:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 * Complexity:
 *
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 *
 * @author Ritaja Sengupta
 * @since 21/01/16
 */
public class MissingInteger {
	public int solution(int[] A) {
		// write your code in Java SE 8
		if (A.length == 0) {
			return 1;
		} else if(A.length == 1){
				return 1;
		}
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				if(A[i] != A[i + 1] && A[i] != A[i + 1] - 1)
				return A[i]+1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		MissingInteger m = new MissingInteger();
		System.out.println(m.solution(new int[]{6, 3, 2, 4, 1, 3, 6, 4}));
	}
}
