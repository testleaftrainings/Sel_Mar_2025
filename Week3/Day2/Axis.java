package week3.day2;

public class Axis implements RBI {

	@Override
	public void knowYourCustomer() {
		System.out.println("AADHAR1");
	}

	@Override
	public void withDrawalLimit() {
		System.out.println("10000");
		
	}
	public void housingLoan() {
		System.out.println("ROT IS 8%");
	}
	public static void main(String[] args) {
		Axis A=new Axis();
		A.knowYourCustomer();
		A.housingLoan();
	}

}
