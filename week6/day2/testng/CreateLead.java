package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod{
	
	/*
	 * //indices value start from '0' - row data
	 * 
	 * @DataProvider(name="getValue" ,indices= {0,2}) public String[][] fetchData()
	 * throws IOException{ //step5 //call the excel program return
	 * PassValueFromExcel.readExcel(); }
	 */
	
	
	@BeforeTest
	public void setValues() {
		fileName="CreateLead";
	}
	
	
	@Test(dataProvider ="getValue" )
	public  void runCreateLead(String cName,String fName,String lName,String phNo) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		
}
}






