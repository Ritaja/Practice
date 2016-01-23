/**
 * Copyright(c) 2009-2016 optile GmbH. All Rights Reserved
 * https://www.optile.net
 * <p>
 * This software is the property of optile GmbH. Distribution
 * of this software without agreement in writing is strictly prohibited.
 * <p>
 * This software may not be copied, used or distributed unless agreement
 * has been received in full.
 */
package codility;

/**
 * https://codility.com/demo/take-sample-test/count_factors/
 *
 * @author Ritaja Sengupta
 * @since 23/01/16
 */
public class CountFactors {
    public int solution(int N) {
        // write your code in Java SE 8
        if (N == 1) {
            return 1;
        }
        int i = 2;
        int count = 2;
        while (i * i < N) {
            if (N % i == 0) {
                count += 2;
            }
            i++;
        }
        if (i * i == N) {
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        CountFactors m = new CountFactors();
        System.out.println(m.solution(24));
    }
}
