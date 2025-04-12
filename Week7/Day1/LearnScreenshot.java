package week7.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		//Add the dependencies-commons-io(2.11)
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//take screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//destination
		
		File destination=new File("./snap/homepage.png");
		
		//connect sorce and destination
		FileUtils.copyFile(source, destination);
		
		//particular field
		
		WebElement textField= driver.findElement(By.id("twotabsearchtextbox"));
		File source1= textField.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/search.png");
		
		FileUtils.copyFile(source1, dest);
	}

}
