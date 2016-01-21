package codility;

import java.util.Arrays;

/**
 * TODO: Add here summary description of that class
 *
 * @author Ritaja Sengupta 
 * @since 20/01/16
 */
public class oddOccArray {
	public int[] solution(int[] A, int K) {
		// write your code in Java SE 8
		int[] rotated = A.clone();
		int len = A.length;
		while (K>=len){
			K -= len;
		}
		for (int i=0;i<len;i++){
			if((i+K) >= (len)){
				rotated[(i+K)-(len)]=A[i];
			}else{
				rotated[(i+K)]=A[i];
			}
		}

		return rotated;
	}
	public static void main(String[] args) {
		oddOccArray m = new oddOccArray();
		System.out.println(Arrays.toString(m.solution(new int[]{3}, 3)));
	}
}
