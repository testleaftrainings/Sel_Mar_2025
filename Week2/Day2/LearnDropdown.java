package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		
		/**
		 * steps to handle the dropdown
		 * 1)identify whether the DD element is present inside the select tag
		 * 2)if the DD is present inside the select tag then locate the element and store it ina local variable.
		 * 3)use the select class and create an object,using this object  access the methods by
		 *  a)select by visible text
		 *  b)select by index
		 *  3)select by value
		 */
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		 String title = driver.getTitle(); 
		 System.out.println(title);
		 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 
		 WebElement pwrd = driver.findElement(By.id("password"));
		 pwrd.sendKeys("crmsfa");
		 
		 //click on login
		 //driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		 //driver.findElement(By.partialLinkText("CRM")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 //click on leads
		 //driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 //click on createlead
		 driver.findElement(By.partialLinkText("Create")).click();
		 //enter company name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 //enter the firstName
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		 //enter the lastName
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		 
		 //click source dropdown
		 WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 //instantiate my select class
		 Select sel=new Select(sourcedd);//shortcut for import the class is ctrl+shift+o
		 sel.selectByIndex(2);
		 //click industry DD
		 WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select dd2=new Select(industryDD);
		 dd2.selectByValue("IND_SOFTWARE");
		 
		 

	}

}
