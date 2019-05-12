package day06;

public class CountApplesAndOranges {
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int[] result = new int[2];
        
        for (int i = 0; i < apples.length; i++) {
        	//House distance
        	if (s <= apples[i] + a && t >= apples[i] + a){
                result[0] += 1;
            }

		}
        
        for (int j = 0; j < oranges.length; j++) {
			if (s <= oranges[j] + b && t >= oranges[j] + b) {
				result[1] += 1;
			}
		}
        
        System.out.print(result[0] +" "+ result[1] + "\n");
    }
	
	public static void main(String[] args) {
		countApplesAndOranges(5, 11, 5, 15, new int[] {-2,2,1}, new int [] {5,-6});
		countApplesAndOranges(2, 3, 1, 5,new int[] {-2}, new int[] {-1});
	}
	
}// Class

