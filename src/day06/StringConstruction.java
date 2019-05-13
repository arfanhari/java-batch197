package day06;

public class StringConstruction {
	
	static int stringConstruction(String s) {
		int sum = 0;
        for(int i = 0; i < s.length(); i++){
        	/*
        	 * apa kegunaan method .chars() ?
        	 * memberikan nilai pada input di setiap karater dalam string s
        	 * 
        	 * apa kegunaan method .distinct() ?
        	 * Metode ini menggunakan metode hashCode () dan equals () 
        	 * untuk mendapatkan elemen yang berbeda.
        	 * 
        	 * apa kegunaan method .count() ?
        	 * menghitung elemen dalam objek stream
        	 * method ini juga memberikan return dalam tipe data long
        	 */
        	//sum = (int) s.chars().distinct().count();
        	
        	
        } 
		return sum;
       
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "abcd";
		String s = "bccb";

		System.out.println(stringConstruction(s));
	}

}
