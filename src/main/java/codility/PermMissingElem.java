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
 * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a zero-indexed array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 *
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 *
 * Assume that:
 *
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 * Complexity:
 *
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 *
 * @author Ritaja Sengupta
 * @since 20/01/16
 */
public class PermMissingElem {
	public int solution(int[] A) {
		// write your code in Java SE 8
		Arrays.sort(A);
		int req = 1;
		for (int i = 0; i < A.length; i++) {
			if (i == A.length - 1 || A[i] != A[i + 1] - 1) {
				req = A[i]+1;
				break;
			}
		}
		return req;
	}

	public static void main(String[] args) {
		PermMissingElem m = new PermMissingElem();
		System.out.println(m.solution(new int[]{1}));
	}
}
