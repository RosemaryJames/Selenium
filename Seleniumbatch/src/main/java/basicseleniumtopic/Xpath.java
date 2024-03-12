package basicseleniumtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		WebElement userName=driver.findElement(By.xpath("//*[contains(@id,'loginform' )]"));
		userName.sendKeys("user123");
		//WebElement userName=driver.findElement(By.xpath("//*[@id='loginform-username' and @class='form-control']"));
		//userName.sendKeys("user123");
		//WebElement password=driver.findElement(By.xpath("//Input[@id='loginform-password']"));
		//password.sendKeys("Rose@1234");
		WebElement password=driver.findElement(By.xpath("//*[@id='loginform-password' or @placeholder='password']"));
		password.sendKeys("Rose@1234");
		//WebElement loginButton=driver.findElement(By.xpath("//button[text()='Login']"));
		//loginButton.click();
		WebElement loginButton=driver.findElement(By.name("login-button"));
		loginButton.click();
		;

	}

}
