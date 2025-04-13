package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass {
	
	public WelcomePage(EdgeDriver driver) {
		this.driver=driver;
	}

	public HomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
	}

}
