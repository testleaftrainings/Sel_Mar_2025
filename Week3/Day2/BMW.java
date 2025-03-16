package week3.day2;

public class BMW extends Auto{
	
	public void voiceCommand() {
		System.out.println("voice cmd is enabled--->bmw class");
	}
	
	public void turnOnAc() {
		System.out.println("turn on AC---->bmw class");
	}
	
	public static void main(String[] args) {
		BMW b=new BMW();
		b.applyBreak();
		
		b.turnOnAc();
		
	}

}
