package basicseleniumtopic;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplecheckboxassgnment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		List<WebElement> multiCheck= driver.findElements(By.xpath("//input[contains(@id,'check-box' )]"));
	
		for(int j=0;j<multiCheck.size();j++)
		{
			WebElement selectAll=multiCheck.get(j);
			selectAll.click();
			System.out.println(multiCheck.get(j).getAccessibleName());
		}
	}

}
