package basicseleniumtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendvalueassignments {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver","D:\\driver\\chromdriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("simple form");
		WebElement sendMessage=driver.findElement(By.id("button-one"));
		sendMessage.click();
		WebElement valuea=driver.findElement(By.id("value-a"));
		valuea.sendKeys("100");
		WebElement valueb=driver.findElement(By.id("value-b"));
		valueb.sendKeys("200");
		WebElement totalValue=driver.findElement(By.id("button-two"));
		totalValue.click();
	}

}
