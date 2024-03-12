package basicseleniumtopic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement clickalertButton1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickalertButton1.click();
		Thread.sleep(1000);
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		WebElement clickalertButton2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickalertButton2.click();
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		WebElement message1=driver.findElement(By.xpath("//p[@id='confirm-demo']"));
		System.out.println(message1.getText());
		WebElement clickalertButton3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickalertButton3.click();
		driver.switchTo().alert().sendKeys("Rosemary");
		driver.switchTo().alert().accept();
		WebElement message2=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
		System.out.println(message2.getText());
	}

}
