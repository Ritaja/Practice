package codility;


/**
 * https://codility.com/programmers/task/count_div/
 *
 * @author Ritaja Sengupta
 * @since 21/01/16
 */
public class CountDiv {
	public int solution(int A, int B, int K) {
		// write your code in Java SE 8
		if (A % K == 0) {
			return (B - A) / K + 1;
		} else {
			return (B - (A - A % K)) / K;
		}
	}

	public static void main(String[] args) {
		CountDiv m = new CountDiv();
		System.out.println(m.solution(5, 4, 3));
	}
}
