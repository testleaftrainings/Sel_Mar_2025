package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		
		int num[]= {3,4,6,5,8};//4,5,6
		int num1[]= {4,5,1,6,7};
		
		//nested loop
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 0; j < num1.length; j++) {
				
				if (num[i]==num1[j]) {
					System.out.println("intersection is:"+num[i]);
					
				}
				
			}
			
		}
		
	}

}
