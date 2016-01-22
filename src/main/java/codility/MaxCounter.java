package codility;

import java.util.Arrays;

/**
 * https://codility.com/programmers/task/max_counters/
 *
 * @author Ritaja Sengupta
 * @since 21/01/16
 */
public class MaxCounter {
	public int[] solution(int N, int[] A) {
		// write your code in Java SE 8
		int[] counter = new int[N];
		if (A.length == 0) {
			return counter;
		}
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if ((1 <= A[i]) && (A[i] <= N)) {
				counter[A[i] - 1] += 1;
				if (counter[A[i] - 1] > max) {
					max = counter[A[i] - 1];
				}
			} else if ((1 <= A[i]) && (A[i] == N + 1)) {
				Arrays.fill(counter, max);
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		MaxCounter m = new MaxCounter();
		System.out.println(Arrays.toString(m.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
	}
}
