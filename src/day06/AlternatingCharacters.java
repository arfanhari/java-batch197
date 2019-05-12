package day06;

public class AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAAABBAA";
		String[] arrS = s.split("");

		System.out.println(arrS[3]);
		System.out.println(alternatingCharacters(arrS));

	}// Main

	static int alternatingCharacters(String[] array) {
		int AlterCount = 0;
		for (int i = 0; i < array.length - 1; i++) {
			// why we should use .equals instead of == ?
			if (array[i].equals(array[i+1]) ) {
				AlterCount++;
			}
		}
		return AlterCount;
	}

}// Class
