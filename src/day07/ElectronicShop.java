package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicShop {
	static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
		int sum = 0;
		List<Integer> totalHarga = new ArrayList<Integer>();
		
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				//biaya keyboard+usb
				//jika harga <= budget
				if (keyboards[i] + drives[j] <= budget) {
					totalHarga.add(keyboards[i] + drives[j]);
				}
			}
		}
		if (totalHarga.size() == 0) {
			sum = -1;
		} else {
			//mencari value tertanggi dari list
			sum = Collections.max(totalHarga);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMoneySpent(new int[] {3, 1}, 
											new int[] {5, 2, 8}, 10));
		System.out.println(getMoneySpent(new int[] {4}, 
											new int[] {5}, 5));
	}

}
