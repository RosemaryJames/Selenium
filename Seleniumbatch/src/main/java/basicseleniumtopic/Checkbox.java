package basicseleniumtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement checkBox=driver.findElement(By.id("gridCheck"));
		checkBox.click();
		WebElement msg1=driver.findElement(By.id("message-one"));
		String message=msg1.getText();
		System.out.println(message);
		boolean b=checkBox.isSelected();
		System.out.println(b);
		WebElement selectAll=driver.findElement(By.id("button-two"));
		selectAll.click();
		boolean d=selectAll.isDisplayed();
		System.out.println(d);
		boolean e=selectAll.isEnabled();
		System.out.println(e);

	}

}
