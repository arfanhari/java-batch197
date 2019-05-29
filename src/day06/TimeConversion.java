package day06;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(timeConversion("07:05:45PM"));
	}
	
	static String timeConversion(String s) {
		String hasil = null;
		//ambil value dari karakter ke 8
		String waktu = s.substring(8);
		//ambil karakter ke 0 (pertama) sampai ke 2
		int jam  = Integer.parseInt(s.substring(0, 2));
		if (waktu.equals("PM")) {
			//berarti waktu di siang hari sampai malam hari sebelum jam 12
			if(jam<12) {
				//maka tambahkan value jam
				jam+=12;
				//String.format --> konversi ke string
				// "%02d" means "format the integer with 2 digits, left padding it with zeroes"
				hasil = String.format("%02d", jam) + s.substring(2, 8);
			} else {
				if (jam == 12) {
					hasil = "00" + s.substring(2,8);
				} else {
					hasil = s.substring (0,8);
				}
			}
		}
		return hasil;
	}// Main

}//Class
