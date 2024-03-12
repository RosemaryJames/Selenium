package basicseleniumtopic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletabhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.manage().window().maximize();
		WebElement newTab=driver.findElement(By.xpath("//button[text()='New Tab']"));
		
		String parentWindow=driver.getWindowHandle();
        System.out.println(parentWindow);
        newTab.click();
        Set<String> allWindows=driver.getWindowHandles();
        for(String childWindow:allWindows)
        {
        	if(!parentWindow.equals(childWindow))
        	{
        		driver.switchTo().window(childWindow);
        		System.out.println(childWindow);
        		WebElement childElement=driver.findElement(By.xpath("//h1[text()='New Tab']"));
        		System.out.println(childElement.getText());
        	}
        }
        driver.switchTo().window(parentWindow);
        
	}

}
