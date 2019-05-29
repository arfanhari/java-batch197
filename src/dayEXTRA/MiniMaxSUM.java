package dayEXTRA;

import java.util.Arrays;

public class MiniMaxSUM {
	
	//pastebin.com/waLSTLBh

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 4 7 8 6 9
		
		int[] arrayInput = new int[] {5, 2, 4, 7, 8, 6, 9};
		Arrays.sort(arrayInput);
		
		/*
		for (int j = 0; j < arrayInput.length; j++) {
			System.out.print(arrayInput[j] + " ");
		}*/
		
		miniMaxSum(arrayInput);
	}
	
	static void miniMaxSum(int[] arr) {
		//Array untuk output
		Long[] output = {0L,0L};
		
        long sum = arr[0];
        long maxValue = arr[0];
        long minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > maxValue) {
                maxValue = arr[i];
            } else if (arr[i] < minValue) {
                minValue = arr[i];
            } else {
                //nothing
            }
        }
        
        output[0] = sum - maxValue;
        output[1] = sum - minValue;

        System.out.println (output[0] + " " + output[1]);
		
	}

}
