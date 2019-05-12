package day06;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int case1 = birthdayCakeCandles(new int[]{3, 2, 1, 3});
		System.out.println(case1);

	}
	
	 static int birthdayCakeCandles(int[] ar) {
	        int count = 0;
	        int highestCandle = 0, candleLeft = 0;

	        for (int i = 0; i < ar.length; i++) {
	            if (ar[i]> highestCandle) {
	                highestCandle = ar[i];
	                count=1;
	            } else if(highestCandle==ar[i]) {
	                    count++;
	                }
	        }

	        candleLeft = count;

	        return candleLeft;
	    }

}
