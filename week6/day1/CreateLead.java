package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod{
	
	@DataProvider(name="getValue")
	public String[][] fetchData(){
		//index value start from '0'
		String data[][]=new String[3][4];
		data[0][0]="Testleaf";
		data[0][1]="Dilip";
		data[0][2]="Kumar";
		data[0][3]="98";
		
		data[1][0]="Testleaf";
		data[1][1]="Vinoth";
		data[1][2]="S";
		data[1][3]="99";
		
		data[2][0]="Testleaf";
		data[2][1]="Gokul";
		data[2][2]="S";
		data[2][3]="97";
		
		return data;
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






