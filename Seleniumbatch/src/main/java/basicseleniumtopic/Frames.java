package basicseleniumtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		//switch by name or id
		//driver.switchTo().frame("frame1");
		
		//switch by webelements 
		WebElement iframeElement=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement);
		
		WebElement frameText=driver.findElement(By.id("sampleHeading"));
		System.out.println(frameText.getText());
		//back to main frame 2 methods
        driver.switchTo().parentFrame();
        //driver.switchTo().defaultContent();
	}

}
