package codility;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://codility.com/programmers/task/genomic_range_query/
 *
 * @author Ritaja Sengupta
 * @since 21/01/16
 */
public class GeometricRangeQuery {
	public int[] solution(String S, int[] P, int[] Q) {
		// write your code in Java SE 8
		int[] s = new int[S.length()];
		HashMap<Character, Integer> impact = new HashMap();
		impact.put('A', 1);
		impact.put('C', 2);
		impact.put('G', 3);
		impact.put('T', 4);
		int i = 0;
		for (char c : S.toCharArray()) {
			s[i++] = impact.get(c);
		}
		int[] ans = new int[P.length];
		for (i = 0; i < P.length; i++) {
			if (Q[i] == P[i]) {
				ans[i] = s[Q[i]];
			} else {
				int[] t = Arrays.copyOfRange(s, P[i], Q[i] + 1);
				Arrays.sort(t);
				ans[i] = t[0];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		GeometricRangeQuery m = new GeometricRangeQuery();
		m.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
	}
}
