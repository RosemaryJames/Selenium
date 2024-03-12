package basicseleniumtopic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.id("uploadfile_0"));
		//element.sendKeys("C:\\Users\\TOSHOBA\\Desktop\\xpath.txt");
		
		Actions obj = new Actions(driver);
	    obj.moveToElement(element).click().perform();
	    
	  //put path to your image in a clipboard
	    StringSelection s1=new  StringSelection("C:\\Users\\TOSHOBA\\Desktop\\xpath.txt");	 
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
	   
	     Robot robot = new Robot();
	     robot.delay(500);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.delay(50);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.delay(50);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
		WebElement checkbox =driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submit =driver.findElement(By.id("submitbutton"));
		submit.click();
}
}
