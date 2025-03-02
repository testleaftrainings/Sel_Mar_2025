package week1.day2;

public class LearnMethods {
	
	//syntax of a mtd:access modifier return type mtdname(parameters){}
	
	
	 public void add(int a,int b,float c){
		 
		 System.out.println(a+b+c);	
				
	}
	 
	private int noOfBicycles(){
		return 3;
		 
	 }
	
	String bicycleData(String brandName,String brandColour,int regNo){
		return brandName+"\n"+brandColour+"\n"+regNo;
		
	}
	
	public static void main(String[] args) {
		
		LearnMethods lm=new LearnMethods();
		lm.add(3, 5, 6.6f);
		System.out.println(lm.bicycleData("activa", "grey",2106 ));
		 int noOf = lm.noOfBicycles();
		System.out.println(noOf);
		
	}

}
