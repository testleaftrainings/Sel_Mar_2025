package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		/*
		 * No such element exception:
		 * locator
		 * implicitwait
		 * element is present inside the frame
		 */
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//hndle the frame
		driver.switchTo().frame("mce_0_ifr");
		
		String text = driver.findElement(By.id("tinymce")).getText();
		System.out.println(text);

	}

}
