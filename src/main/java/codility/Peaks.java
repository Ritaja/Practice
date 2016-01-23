package codility;

/**
 * https://codility.com/programmers/task/peaks/
 * Created by ritajasengupta on 23/01/16.
 */
public class Peaks {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length <= 1) {
            return 1;
        }
        int p = 0;
        int count = 0;
        for (int i = 1; i < A.length-1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                if (A.length % (++p) == 0) {
                    count = p;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Peaks m = new Peaks();
        System.out.println(m.solution(new int[]{1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}));
    }
}
