package day06;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static String timeConversion(String s) {
		String hasil = null;
		String waktu = s.substring(8);
		int jam  = Integer.parseInt(s.substring(0, 2));
		if (waktu.equals("PM")) {
			if(jam<12) {
				jam+=12;
				hasil = String.format("%02", jam) + s.substring(2, 8);
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
