package codility;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public int solution(int N) {
		List<Integer> allMatches = new ArrayList<Integer>();
		// write your code in Java SE 8
		String rep = Integer.toBinaryString(N);
		System.out.println("this is rep: " + rep);
		String pattern = "1*0+1";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(rep);
		int count=0;
		int longest=0;
		while (m.find( )) {
			count++;
			if(count==1) {
				longest = m.group().length() - 2;
			} else {
				longest = m.group().length() > longest + 1 ? (m.group().length() - 1) : longest;
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		Main m = new Main();
        m.solution(529);
	}
}
