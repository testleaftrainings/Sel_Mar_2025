package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		/*
		 * steps to interact with the WebElemnt
		 * 
		 * 1)locate the element(find the element from the dom)
		 * 2)interact the webelemnt(key interactions---Sendkeys and click)
		 * 3)to locate the element--->(findelement)
		 * 4)No such element exception(locators is found to be wrong)
		 */
		
		
		
		ChromeDriver dri=new ChromeDriver();
		
		dri.get("http://leaftaps.com/opentaps/control/main");
		dri.manage().window().maximize();
		 String title = dri.getTitle(); 
		 System.out.println(title);
		 
		 //locate the username
		 
		 dri.findElement(By.id("username")).sendKeys("demosalesmanager");
		 
		 WebElement pwrd = dri.findElement(By.id("password"));
		 pwrd.sendKeys("crmsfa");
		 
		 //click on login
		 dri.findElement(By.className("decorativeSubmit")).click();
		 
		 dri.findElement(By.partialLinkText("CRM")).click();
		 
		// dri.close();//close the current window
		 
		 dri.quit();//closes all the tabs

	}

}
