package basicseleniumtopic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basicselenium2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");

	}

}
