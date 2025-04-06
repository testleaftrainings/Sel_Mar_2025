package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	//public ChromeDriver driver;
	public RemoteWebDriver driver;
	
	public String fileName;

	//maintain in any order get from xml file
	@Parameters({"url","userName","passWord","browser"})	
	//maintain the order from @Parameters- create input args
	@BeforeMethod
	public void preCondition(String url,String username,String password,String browserType) {

		//if(chrome.equalsIgnoreCase("chrome"))
		if(browserType.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("edge")) {
		driver =new EdgeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

	//indices value start from '0' - row data
		@DataProvider(name="getValue" ,indices= {0})
		public String[][] fetchData() throws IOException{
			return PassValueFromExcel.readExcel(fileName);
		}


}
