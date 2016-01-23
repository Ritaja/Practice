/**
 * Copyright(c) 2009-2016 optile GmbH. All Rights Reserved
 * https://www.optile.net
 *
 * This software is the property of optile GmbH. Distribution
 * of this software without agreement in writing is strictly prohibited.
 *
 * This software may not be copied, used or distributed unless agreement
 * has been received in full.
 */
package codility;

import java.util.Arrays;

/**
 * Thttps://codility.com/programmers/task/equi_leader/
 *
 * @author Ritaja Sengupta
 * @since 22/01/16
 */
public class EquiLeader {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int len = A.length - 1;
		int lead = A[len / 2];
		int[] B = A.clone();
		Arrays.sort(A);
		//forward pass
		int count = 1;
		for (int i = (len / 2) + 1; i <= len; i++) {
			if (A[i] == lead) {
				count++;
			} else {
				break;
			}
		}
		// back pass
		for (int i = (len / 2) - 1; i >= 0; i--) {
			if (A[i] == lead) {
				count++;
			} else {
				break;
			}
		}
		// if no lead
		if (count <= len / 2) {
			return 0;
		}
		A = B.clone();
		// if lead
		int total = count;
		count = 0;
		int n = 0;
		for (int i = 0; i <= len; i++) {
			if (A[i] == lead) {
				count++;
			}
			// i + 1 as length of array is one greater than the i
			if (count > (i + 1) / 2 && (total - count) > (len - i) / 2) {
				n++;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		EquiLeader m = new EquiLeader();
		System.out.println(m.solution(new int[]{4, 3, 4, 4, 4, 2}));
	}
}
