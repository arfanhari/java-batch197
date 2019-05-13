package day07;

public class AbstractTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initial obj
		Bank01 b1;
		
		//instance obj
		b1 = new SBI01();
		System.out.println("Rate of Interest Is : " + b1.getRateOfInterest());
		
		b1 = new SBI01();
		System.out.println("Rate of Interest Is : " + b1.getRateOfInterest());
	}

}
