package week3.day2;

public class ICI extends ICICI{

	@Override
	public void knowYourCustomer() {
		System.out.println("PANCARAD");
	}

	@Override
	public void withDrawalLimit() {
		System.out.println("5000");
	}

	@Override
	public void convertCurerency() {
		System.out.println("inDollars");
		
	}
	public static void main(String[] args) {
		ICI I=new ICI();
		I.cibiScore();
		I.withDrawalLimit();
	}

}
