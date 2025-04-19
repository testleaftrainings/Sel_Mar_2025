package week8.day1;

public class EmpDetails {
	
	public static void main(String[] args) {
		
		EmployeeDetails ed=new EmployeeDetails();
		ed.setEmpName("saranya");
		ed.setAge(40);
		
		System.out.println(ed.getEmpName()+"\n"+ed.getAge());
	}

}
