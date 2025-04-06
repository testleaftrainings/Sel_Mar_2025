package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

	public ChromeDriver driver;
	
	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://leaftaps.com/opentaps/control/main");
	} 
	@When("Enter the UserName as DemoSalesManager")
	public void enter_the_user_name_as_demo_sales_manager() {
	   driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	@When("Enter the PassWord as crmsfa")
	public void enter_the_pass_word_as_crmsfa() {
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("Click on loginButton")
	public void click_on_login_button() {
	    driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify Login is Successful")
	public void verify_login_is_successful() {
	    String title = driver.getTitle();
	    
	    if(title.contains("Leaftaps")) {
	    	System.out.println("Login is successful");
	    }else {
	    	System.out.println("Login is not Successful");
	    }
	    
	    
	}


}
