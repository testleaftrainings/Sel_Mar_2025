package week4.day1;

public class LearnMethodOverloading {
	
	/*
	 * Overloading:mthd signatute is same but with different args and with different datatypes
	 * staic/compitime/earlybinding
	 */
	
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	public void add(int a,int b,float c) {
		System.out.println(a+b+c);
		
	}
	public void add(int a,float c,int b) {
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		
		LearnMethodOverloading lmo=new LearnMethodOverloading();
		lmo.add();
		lmo.add(3, 3, 4.4f);
		
	}
	
	
}
