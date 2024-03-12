package basicseleniumtopic;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlassignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		List<WebElement> rowcount =driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		List<WebElement> columncount =driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		for(int i=0;i<rowcount.size();i++)
		{
		for(int j=0;j<columncount.size();j++)
		{
			WebElement table= driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td["+(j+1)+"]"));
			
			System.out.print(table.getText()+" ");
			
		}
		System.out.println();
	}}
}


