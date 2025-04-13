package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(EdgeDriver driver) {
		this.driver=driver;
	}

	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}

}
