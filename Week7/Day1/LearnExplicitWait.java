package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//instantiate webdriverwait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		
		//use the condns
		
		WebElement firstelement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		firstelement.click();
		//visiblity
		WebElement visiblity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		boolean click = visiblity.isDisplayed();
		System.out.println(click);
		
	}

}
