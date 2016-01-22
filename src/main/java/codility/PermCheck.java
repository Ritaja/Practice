package codility;


import java.util.Arrays;

/**
 * https://codility.com/programmers/task/perm_check/
 *
 * @author Ritaja Sengupta
 * @since 20/01/16
 */
public class PermCheck {
	public int solution(int[] A) {
		// write your code in Java SE 8
		Arrays.sort(A);
		if (A.length == 0) {
			return 0;
		}
		if (A.length == 1 && A[0] != 1) {
			return 0;
		}
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] != A[i + 1] - 1) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		PermCheck m = new PermCheck();
		System.out.println(m.solution(new int[]{1, 2000}));
	}
}
