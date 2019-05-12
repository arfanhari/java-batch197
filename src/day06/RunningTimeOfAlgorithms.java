package day06;

public class RunningTimeOfAlgorithms {

	static int runningTime(int[] arr) {
		int iteration = 0;
		
		//funsi Insertion sort
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > value) {
				arr[j + 1] = arr[j];
				j = j - 1;
				//menghitung iterasi yang terjadi
				iteration++;
			}
			arr[j + 1] = value;
		}
		
		return iteration;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(runningTime(new int[] {2, 1, 3, 1, 2}));
		System.out.println(runningTime(new int[] {1, 1, 2, 2, 3, 3, 5, 5, 7, 7, 9, 9}));
		
	}

}
