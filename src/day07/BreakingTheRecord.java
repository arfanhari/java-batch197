package day07;

import java.util.Arrays;

public class BreakingTheRecord {
	static int[] breakingRecords(int[] scores) {
		int max = 0;
		int vMax = scores[0];
		int min = 0;
		int vMin = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]> vMax) {
				max++;
				vMax = scores[i];
			}
			if( scores[i] <vMin ) {
				min++;
				vMin = scores[i];
			}
		}
		
		return new int[] {max, min};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array1 = breakingRecords(new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1});
		System.out.println(Arrays.toString(Array1));
	}

}
