package ft1;

public class Soal10 {

	static void pangrams(String s) {
		String result[] = new String[2];

		s = s.replaceAll("[-+.^:;,]", "");
		s = s.replace(" ", "");
		s = s.toLowerCase();

		char input[] = s.toCharArray();

		int alphabet[] = new int[26];

		// mengisi setiap indeks array alphabet
		for (int i = 0; i < input.length; i++) {
			// int index = input[i] - 97 -->
			// simpan nilai input karakter ke i - 97
			// ( 97 = bilangan ascii untuk a )
			//
			int index = input[i] - 97;
			alphabet[index] = 1;
		}

		int j = 0;
		// mengecek apakah input = pangrams atau bukan
		while (j != 26) {
			// jika terpenuhi bahwa alphabet[j] == 1 secara menyeluruh maka kalimat adalah pangram
			if (alphabet[j] == 1) {
				j++;
			} else {
				System.out.println("not pangram");
				System.exit(0);

			}
		}
		System.out.println("pangram");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pangrams("Quick Brown Fox Jumps Over The Lazy Dog");
		pangrams("Sphinx of black quartz, judge my vow");
		pangrams("Brawny gods just flocked up to quiz and vex him");
		pangrams("Check back tomorrow; I will see if the book has arrived");
	}

}
