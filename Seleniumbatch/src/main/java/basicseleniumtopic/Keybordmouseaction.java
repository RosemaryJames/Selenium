package basicseleniumtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keybordmouseaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement doubleClickbutton=driver.findElement(By.id("doubleClickBtn"));
		Actions actObj=new Actions(driver);
		actObj.doubleClick(doubleClickbutton).perform();
		
		WebElement rightClickbutton=driver.findElement(By.id("rightClickBtn"));
		actObj.contextClick(rightClickbutton).perform();
		
		actObj.moveToElement(doubleClickbutton).perform();//mouse overing
		
		actObj.sendKeys(Keys.ARROW_DOWN).perform();//Keys is static method
		

	}

}
