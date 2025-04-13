package week7.day2;

public class LearnConstructor {
	/*
	 * Constructor-used to initialize the object
	 * 1)construtor name should be same as that of class name
	 * 2)difference between mtd and constructor-will not have return type
	 * types:
	 * 1)default(with no args)
	 * 2)parameterized constructor(has args)---->constructor overloading
	 * 
	 * this:used differentiate between local and global varaibles
	 * can you call on constructor from another constructor?---yes,that can be done using this keyword(constructor chaining)
	 */
	
	int empId;
	String empName;
	boolean empStatus;
	
	
	public LearnConstructor() {
		//this(56,"saranya",true);
		System.out.println("default constructor");
		empId=89;
	}
	
	public LearnConstructor(int empId,String empName,boolean empStatus) {
		
		this();
		
		
		System.out.println("parameterized constructor");
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
	}
	
	
	
	public static void main(String[] args) {
		
		  
		
		  LearnConstructor lc1=new LearnConstructor(87, "saran", true);
		  System.out.println(lc1.empId+" "+lc1.empName+" "+lc1.empStatus);
		 
		
		/*
		 * LearnConstructor lc=new LearnConstructor();
		 * System.out.println(lc.empId+" "+lc.empName+" "+lc.empStatus);
		 */
		
	}

}
