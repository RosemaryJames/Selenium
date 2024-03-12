package basicseleniumtopic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Basicselenium1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		

	}

}
