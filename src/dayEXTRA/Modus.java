package dayEXTRA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Modus {
	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input = new Scanner(System.in);
		
		System.out.printf("Masukan banyak Input : ");
		int n = input.nextInt();

		int value = 0;
		int count = 0;
		HashMap<Integer,Integer> dataInput = new HashMap<Integer, Integer>();
		
		//input hashmap
		for(int i = 0; i < n; i++) {
			value = input.nextInt();
			dataInput.put(value,count);
		}
		
		//proses
		for(int i = 0; i < n; i++) {
			/*
			 * Dapatkan nilai key 
			 * Cek apakah sama dengan key berikutnya?
			 * Yes -> Count++
			 * Next, 
			 */
			
		}
		
	}
	
	public static Object getKeyFromValue(Map hm, Object value) {
	    for (Object o : hm.keySet()) {
	      if (hm.get(o).equals(value)) {
	        return o;
	      }
	    }
	    return null;
	  }

}
