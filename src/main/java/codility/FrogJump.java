package codility;

/**
 * https://codility.com/programmers/task/frog_jmp/
 *
 * @author Ritaja Sengupta
 * @since 20/01/16
 */
public class FrogJump {

	public int solution(int X, int Y, int D) {
		// write your code in Java SE 8
		return (int) Math.ceil(((Y - X) / (double) D));
	}

	public static void main(String[] args) {
		FrogJump m = new FrogJump();
		System.out.println(m.solution(3, 999111321, 7));
	}
}
