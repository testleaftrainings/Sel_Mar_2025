package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//Launch the Browser
		
		ChromeDriver dri=new ChromeDriver();
		
		//EdgeDriver driver1=new EdgeDriver();
		
		//load the url
		
		dri.get("https://www.amazon.in/");
		
		//maximize
		
		dri.manage().window().maximize();
		
		//get the the title
		
		
		
	
		 String title = dri.getTitle(); 
		 System.out.println(title);
		 
		
		

	}

}
