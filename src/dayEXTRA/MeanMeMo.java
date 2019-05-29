package dayEXTRA;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeanMeMo {
	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// statistik(new int[] {5,2,5,5,2,1,2,9,7,8,3,9,2,1,4,5,2,2,4,6,2,1,2});
		// statistik(new int[] { 9, 2, 1, 2, 1, 31, 23, 12, 4, 10, 11, 12, 13, 14, 121,
		// 2, 3, 12, 31, 231, 2312, 41, 54, 6, 4, 8, 5, 6, 7, 4, 3, 54, 35 });
		// mean(new int[] {3, 2, 0, -12, 9, 8, 8, 3, 2});
		// mean(new int[] {1, 2, 4, 7, 7, 10, 2, 4, 5, 9});
		// median(new int[] {1, 2, 4, 7, 7, 10, 2, 4, 5, 9});

		input = new Scanner(System.in);

		System.out.printf("Masukan Input : ");
		String n = input.nextLine();

		String[] arrayString = n.split(" ");
		int[] arrayInput = new int[arrayString.length];

		for (int i = 0; i < arrayString.length; i++) {
			arrayInput[i] = Integer.parseInt(arrayString[i]);
		}
		
		//sortManual(arrayInput);
		modus(arrayInput);
		median(arrayInput);
		mean(arrayInput);

	}// Main

	public static void sortManual(int[] arr) {

		int temp = 0;
		
		//Loop iterasi
		for (int i = 0; i < arr.length; i++) {
			//loop pembanding
			for (int j = 0; j < (arr.length - 1); j++) {
				//if arr[before] > arr[after]
				if (arr[j] > arr[j+1]) {
					//simpan arr[before] ke temp
					temp = arr[j];
					//berikan nilai arr[after] kepada arr[before]
					arr[j] = arr[j+1];
					//berikan nilai sementara kepada arr[after]
					arr[j+1] = temp;
				}
			}
		}
		
		// Cek hasil BubbleSort
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

	public static void modus(int[] arr) {
		HashMap<Integer, Integer> dataInput = new HashMap<Integer, Integer>();

		//Arrays.sort(arr);

		// looping sebanyak panjang array
		for (int i = 0; i < arr.length; i++) {
			// .containsKey berfungsi sebagai pembanding
			// apakah ada nilai (array ke-i)
			// dibagian key pada Map
			// Bernilai TRUE apabila nilai tersebut sudah diinisialisasi
			if (dataInput.containsKey(arr[i])) {
				// .get will return value to which the specified key is mapped
				// yang mana value ini adalah jumlah kemunculan
				int value = dataInput.get(arr[i]);
				value++;
				// update jumlah kemunculan nilai
				dataInput.put(arr[i], value);
			} else {
				// berikan key-dataInput dengan nilai array ke-i
				// berikan value-dataInput dengan nilai inisialisasi jumlah kemunculan yaitu 1
				dataInput.put(arr[i], 1);
			}

		}

		// int maxValueInMap=(Collections.max(dataInput.values()));

		int key = Collections.max(dataInput.entrySet(), Map.Entry.comparingByValue()).getKey();
		int value = Collections.max(dataInput.values());

		System.out.println("\nModus : " + key + "\nValue : " + value);
	}

	public static void median(int[] arr) {
		//Arrays.sort(arr);
		sortManual(arr);
		
		float med = 0;

		if (arr.length % 2 == 0) {
			med = (float) (arr[(arr.length - 1) / 2] + arr[((arr.length - 1) / 2) + 1]) / 2;
		} else {
			med = (float) (arr[arr.length / 2]);
		}

		System.out.println("Median : " + med);
	}

	public static void mean(int[] arr) {
		double sum = 0;
		double mean = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		mean = (double) (sum / arr.length);
		System.out.println("Mean : " + mean);
	}

}// Class
