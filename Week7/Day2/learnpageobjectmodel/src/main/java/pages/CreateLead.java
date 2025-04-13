package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass{
	
	public CreateLead(EdgeDriver driver) {
		this.driver=driver;
	}

	public CreateLead enterCname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		return this;
		
	}
	
	public CreateLead enterfName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		return this;
		
		
		
	}
	public CreateLead enterlName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		return this;
		
	}
	public ViewLeads clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		
		return new ViewLeads(driver);
	}
	

}
