package codility;


import java.util.Arrays;

/**
 * https://codility.com/programmers/task/perm_missing_elem/
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
				req = A[i] + 1;
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
