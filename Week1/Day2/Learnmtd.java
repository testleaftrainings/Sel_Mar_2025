package week1.day2;

public class Learnmtd {
	//syntax of a mtd:access modifier return type mtdname(){}
	
	public void add(){
		
		int a=4;
		int b=5;
		System.out.println(a+b);
		
	}
public void sub(){
		
		int a=4;
		int b=5;
		System.out.println(a-b);
		
	}
	
	public static void main(String[] args) {
		
		//class name objname=new classname();
		Learnmtd lm=new Learnmtd();
		lm.add();
		lm.sub();
		
		
		
	}
	

}
