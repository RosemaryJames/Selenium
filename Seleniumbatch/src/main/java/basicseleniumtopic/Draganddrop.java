package basicseleniumtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement sourceElement=driver.findElement(By.xpath("//li[@id='credit2']//a[@class='button button-orange']"));
		WebElement targetElement=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		Actions actObj=new Actions(driver);
		actObj.dragAndDrop(sourceElement, targetElement).perform();
		WebElement sourceElement1=driver.findElement(By.xpath("//li[@id='fourth']//a[@class='button button-orange']"));
		WebElement targetElement1=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		actObj.dragAndDrop(sourceElement1, targetElement1).perform();

	}

}
