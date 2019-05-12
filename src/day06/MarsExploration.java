package day06;

public class MarsExploration {
	
	static int marsExploration(String s) {
        int differenceCount  = 0;

        for (int i = 0; i < s.length()-1; i+=3) {
            if(s.charAt(i)!='S'){
                differenceCount++;
 
            }
 
            if(s.charAt(i+1)!='O'){
                differenceCount++;
 
            }
 
            if(s.charAt(i+2)!='S'){
                differenceCount++;
 
            }
        }
        
        return differenceCount;

    }
	public static void main(String[] args) {
		String s = "SSSSSSSSS";

		System.out.println(marsExploration(s));
	}
}
