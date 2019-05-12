package day06;

public class HackerrankInString {
	static String hackerrankInString(String s) {
		String cek = "hackerrank";
		int j = 0;

		// looping
		for (int i = 0; i < s.length(); i++) {
			// membandingkan apakah string s ke i == string str ke j
			if (j < cek.length() && s.charAt(i) == cek.charAt(j)) {
				// jika true maka j++
				j++;
			}
		}
		/*
		 * bernilai "YES" apabila j == cek.length(); kenapa demikian? karena j hanya
		 * akan ditambahkan apabila string input ke i == string cek ke j
		 */
		return (j == cek.length() ? "YES" : "NO");

	}

	public static void main(String[] args) {
		System.out.println(hackerrankInString("hhaacckkekraraannk"));

	}
}
