package codility;

/**
 * https://codility.com/programmers/task/passing_cars/
 *
 * @author Ritaja Sengupta
 * @since 21/01/16
 */
public class PassingCars {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int count = 0;
		int incrementVal = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				incrementVal++;
			} else //when (A[i]==1)
			{
				count = count + incrementVal;
			}
			if (count > 1000000000)
				return -1;
		}
		return count;
	}

	public static void main(String[] args) {
		PassingCars m = new PassingCars();
		System.out.println(m.solution(new int[]{0, 1, 0, 1, 1}));
	}
}
