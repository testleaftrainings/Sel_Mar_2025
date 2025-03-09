package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		 String title = driver.getTitle(); 
		 System.out.println(title);
		 
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		 

	}

}
