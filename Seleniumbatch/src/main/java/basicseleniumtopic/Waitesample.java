package basicseleniumtopic;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waitesample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver","D:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//implicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));//explicit wait
		wait.until(ExpectedConditions.alertIsPresent());
		WebElement userName=driver.findElement(By.xpath("//input[@id='loginform-username']"));
		wait.until(ExpectedConditions.attributeToBe(userName, "id", "loginform-username"));
		wait.until(ExpectedConditions.elementToBeClickable(userName));
	    Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(30))
	            .pollingEvery(Duration.ofSeconds(5))
	            .ignoring(NoSuchElementException.class);//fluent wait
	    fluentWait.until(ExpectedConditions.attributeToBe(userName, "id", "loginform-username"));
	    fluentWait.until(ExpectedConditions.alertIsPresent());
	}

}
