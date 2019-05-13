package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
	static int birthday(List<Integer> s, int d, int m) {
		int result = 0;
		for (int i = 0; i < s.size(); i++) {
			//initialize and reset count
			int count = 0;
			//hitung nilai coklat pada array ke m
			for (int j = 0; j < m; j++) {
				if (i + j < s.size()) {
					count += s.get(i+j);
				}
			}
			// batas chocolate bar 
			if (count == d) {
				result++;
			}
		}
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(1, 2, 1, 3, 2)), 3, 2));
		System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(2, 2, 1, 3, 2)), 4, 2));
		System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(4, 1, 4, 4)), 4, 1));
	}

}
