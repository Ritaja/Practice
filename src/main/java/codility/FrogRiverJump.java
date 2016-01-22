package codility;

import java.util.Arrays;

/**
 * https://codility.com/programmers/task/frog_river_one/
 *
 * @author Ritaja Sengupta
 * @since 21/01/16
 */
public class FrogRiverJump {
	public int solution(int X, int[] A) {
		// write your code in Java SE 8
		int[] C = new int[X];
		if (X == 0) {
			return 0;
		}
		if (A.length == 0) {
			return -1;
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X && C[A[i] - 1] == 0) {
				C[A[i] - 1] = i;
			}
		}

		System.out.println(" " + Arrays.toString(C));
		int high = 0;
		for (int num : C) {
			if (num == 0 && high != 0) {
				return -1;
			} else if (num > high) {
				high = num;
			}
		}

		return high;
	}

	public static void main(String[] args) {
		FrogRiverJump m = new FrogRiverJump();
		System.out.println(m.solution(5, new int[]{5, 3, 2, 4, 1, 3, 5, 4}));
	}
}
