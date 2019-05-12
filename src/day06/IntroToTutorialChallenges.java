package day06;

public class IntroToTutorialChallenges {
	static int introTutorial(int V, int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == V) {
				index = i;
			}
		}
		
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(introTutorial(4, new int[] {1, 4, 5, 7, 9, 12}));

	}

}
