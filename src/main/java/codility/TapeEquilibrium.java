package codility;

/**
 * https://codility.com/programmers/task/tape_equilibrium/
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
			B[i++] = cum;
		}
		cum = Math.abs(B[0] - (B[A.length - 1] - B[0]));
		for (i = 1; i < A.length; i++) {
			int dif = Math.abs(B[i] - (B[A.length - 1] - B[i]));
			if (dif < cum) {
				cum = dif;
			}
		}
		return cum;
	}

	public static void main(String[] args) {
		TapeEquilibrium m = new TapeEquilibrium();
		System.out.println(m.solution(new int[]{1, 2000}));
	}
}
