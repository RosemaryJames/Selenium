package testNGBasics;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolltest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,4500)");
	    //Below commands is using for clicking an element
	    WebElement element =driver.findElement(null);
	    js.executeScript("arguments[0].click()", element);//for click
  }
}
