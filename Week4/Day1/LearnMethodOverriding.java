package week4.day1;

public class LearnMethodOverriding extends LearnMethodOverloading {
	
	public void add() {
		int a=2;
		int b=5;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		LearnMethodOverriding lm=new LearnMethodOverriding();
		lm.add();
		
	}

}
