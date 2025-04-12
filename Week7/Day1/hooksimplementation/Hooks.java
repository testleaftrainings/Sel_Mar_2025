package hooksimplementation;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepdefinition.BaseClass;

public class Hooks  {
	
	public static EdgeDriver driver;
	
	@Before
	public void preCondn() {
		driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@After
	public void postCondn() {
		
		driver.close();
		
	}

}
