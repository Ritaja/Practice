/**
 * Copyright(c) 2009-2016 optile GmbH. All Rights Reserved
 * https://www.optile.net
 *
 * This software is the property of optile GmbH. Distribution
 * of this software without agreement in writing is strictly prohibited.
 *
 * This software may not be copied, used or distributed unless agreement
 * has been received in full.
 */
package codility;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * https://codility.com/demo/take-sample-test/nesting/
 *
 * @author Ritaja Sengupta
 * @since 22/01/16
 */
public class Nesting {
	// write your code in Java SE 8
	public int solution(String S) {
		ArrayList<Character> count = new ArrayList();
		int i = 0;
		for (char c : S.toCharArray()) {
			if (c == '(') {
				count.add(c);
				i++;
			} else if (i != 0 && c == ')') {
				count.remove(i - 1);
				i--;
			} else {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Nesting m = new Nesting();
		System.out.println(m.solution(")("));
	}
}
