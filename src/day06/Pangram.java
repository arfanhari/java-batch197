package day06;

public class Pangram {
	static String pangrams(String s) {
		String result[] = new String[2];
		
		s = s.replace(" ", "");
		s = s.toLowerCase(); 
		
 		char input[] = s.toCharArray();

		int alphabet[] = new int[26];
		
		//mengisi setiap indeks array alphabet 
		for (int i = 0; i < input.length; i++) {
			// int index = input[i] - 97 --> 
			// simpan nilai  input karakter ke i - 97
			// ( 97 = bilangan ascii untuk a )
			//
			int index = input[i] - 97;
			alphabet[index] = 1;
		}
		
		//mengecek apakah input = pangrams atau bukan
		for (int j = 0; j < alphabet.length; j++) {
			//jika terpenuhi bahwa alphabet[j] == 1 maka return result[1]
			if (alphabet[j] == 1) {
				j++;
			} else {
				// kenapa pada j ke 23 program tidak berpindah ke kondisi else??
				// harus ada kondisi untuk berhenti?
				System.out.println(result[0]);
				return (result[0] = "not a pangram");
				
			}
		}
		return (result[1] = "pangram");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
		//System.out.println(pangrams("The Quick Brown Fox Jumps Over The Lazy Dog"));
	}

}
