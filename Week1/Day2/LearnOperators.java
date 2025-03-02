package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		
		//arithmetic operators
		
		System.out.println(11%2);
		
		//assignment operators
		//-->assigning a value to a variable
		
		int a=5,b=10;
		a+=6;//a=a+6
		System.out.println(a);
		b-=5;//b=b-5
		System.out.println(b);
		
		//comparison operators
		System.out.println(3>3);
		
		//logical operators
		System.out.println((4==3)&&(5==6)||(7==7));//0*0-->0(false)  0+1-->1(true)
		
		LearnMethods learn=new LearnMethods();
		learn.add(7, 3, 2.2f);
		
		
		//unaryOperators
		int x=1;
		//System.out.println(++x);//x is incremented by 1//x=2//preincrement
		System.out.println(x++);//2
		System.out.println(x);//x=3
		
		
		
		

	}

}
