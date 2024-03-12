package basicseleniumtopic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonassignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver","D:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement rdbutton1=driver.findElement(By.id("inlineRadio1"));
		rdbutton1.click();
		WebElement rdbuttonmsg1=driver.findElement(By.id("button-one"));
		rdbuttonmsg1.click();
		WebElement rdbuttonmessage1=driver.findElement(By.id("message-one"));
		String msg1=rdbuttonmessage1.getText();
		System.out.println(msg1);
		WebElement rdbutton2=driver.findElement(By.id("inlineRadio21"));
		rdbutton2.click();
		WebElement agebutton2=driver.findElement(By.id("inlineRadio23"));;
		agebutton2.click();
		WebElement rdbuttonmsg2=driver.findElement(By.id("button-two"));
		rdbuttonmsg2.click();
		WebElement rdbuttonmessage2=driver.findElement(By.id("message-two"));
		String msg2=rdbuttonmessage2.getText();
		System.out.println(msg2);
	}

}
