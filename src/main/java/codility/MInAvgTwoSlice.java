package codility;

/**
 * https://codility.com/demo/take-sample-test/min_avg_two_slice/
 *
 * @author Ritaja Sengupta
 * @since 22/01/16
 */
public class MInAvgTwoSlice {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int len = A.length;
		int[] sum = new int[len];
		sum[0] = A[0];
		for (int i = 1; i < len; i++) {
			sum[i] = sum[i - 1] + A[i];
		}
		int index = 1;
		int avg = (sum[len - 1]) / len;
		for (int i = 1; i < len; i++) {
			int t = (sum[len - 1] - sum[i - 1]) / (len - i);
			if (t < avg) {
				avg = t;
				index = i;
			}
		}
		if (index != 1) {
			if (avg > (sum[index] / len))
				index = 1;
		}
		return index;
	}
	public static void main(String[] args) {
		MInAvgTwoSlice m = new MInAvgTwoSlice();
		System.out.println(m.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
	}
}
