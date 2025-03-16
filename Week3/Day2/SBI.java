package week3.day2;

public class SBI extends Axis implements RBI,Inter {

	@Override
	public void knowYourCustomer() {
		System.out.println("AADHAR");
		
	}

	@Override
	public void withDrawalLimit() {
		System.out.println("25000");
		
	}
	
	public void goldLoan() {
		System.out.println("rate of interest is 7%");
	}
	public static void main(String[] args) {
		SBI S=new SBI();
		S.goldLoan();
		S.knowYourCustomer();
		S.withDrawalLimit();
		S.housingLoan();
	}

	@Override
	public void systemDesign() {
		// TODO Auto-generated method stub
		
	}
	
	

}
