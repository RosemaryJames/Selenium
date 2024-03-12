package basicseleniumtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement clickMe1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMe1.click();
		String alertText1=driver.switchTo().alert().getText();
		System.out.println(alertText1);
		driver.switchTo().alert().accept();
		
		
		 

	}

}
