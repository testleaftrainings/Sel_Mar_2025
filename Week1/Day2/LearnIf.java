package week1.day2;

public class LearnIf {

	public static void main(String[] args) {
		//if stmt
		int marks=60;
		//shortcut for using if--->type if and do ctrl+space
		if (marks>=50) {
			System.out.println("pass");
			
		}
		
		//if else
		
		if (marks>=70) {
			
			System.out.println("grade1");
			
		} else {
			System.out.println("fail");

		}
		
		//nested if
		int marks1=80;
		if (marks1==60) {
			System.out.println("grade1");
			
		} else if(marks1<40) {
			System.out.println("fail");

		}
		else if(marks1>=80) {
			System.out.println("distinction");
		}
		else {
			System.out.println("out of range");
		}

	}

}
