package basicseleniumtopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicwebelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		//driver.navigate().to("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.id("loginform-username"));
		userName.sendKeys("user123");
		WebElement password=driver.findElement(By.xpath("//Input[@id='loginform-password']"));
		password.sendKeys("Rose@1234");
		WebElement loginButton=driver.findElement(By.xpath("//button[text()='Login']"));
		loginButton.click();
		//userName.clear();
		String attribute=loginButton.getAttribute("class");
		System.out.println(attribute);
		String fontSize=loginButton.getCssValue("font-size");
		System.out.println(fontSize);
		//Thread.sleep(1000);
		String elementText=loginButton.getText();
		System.out.println(elementText);
		//Thread.sleep(1000);
		String tagName=loginButton.getTagName();
		System.out.println(tagName);
		
	
		driver.close();
}

}
