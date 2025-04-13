package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage enterUname() {
		driver.findElement(By.id("username")).sendKeys("demoCSR");
		
		/*
		 * LoginPage lp=new LoginPage(); return lp;
		 */
		return this;
	}
	
	
	public LoginPage enterPwd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		return this;
		
	}
	
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new WelcomePage(driver);
		
	}

}
