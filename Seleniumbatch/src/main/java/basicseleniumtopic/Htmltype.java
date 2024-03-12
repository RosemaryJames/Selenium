package basicseleniumtopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmltype {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		List<WebElement> tableHead= driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr/th"));
		for(int i=0;i<tableHead.size();i++)
		{
			System.out.print(tableHead.get(i).getText()+" ");
		}
		System.out.println();
		List<WebElement> tableRow1= driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		for(int j=0;j<tableRow1.size();j++)
		{
			System.out.print(tableRow1.get(j).getText()+" ");
		}
		System.out.println();
		WebElement firstElement=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[1]"));
		System.out.println(firstElement.getText());
		List<WebElement> tablecolumn= driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(int j=0;j<tablecolumn.size();j++)
		{
			System.out.println(tablecolumn.get(j).getText()+" ");
		}
		System.out.println();
		for(int j=0;j<tablecolumn.size();j++)
		{
			if(tablecolumn.get(j).getText().equals("Garrett Winters"))
			{
				//String locatorString ="//table[@id='dtBasicExample']//tbody//tr["+(j+1)+"]//td[1]";
				//System.out.println(locatorString);
				//WebElement element=driver.findElement(By.xpath(locatorString));
				//System.out.println(element.getText());
				//break;
				WebElement element= driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+(j+1)+"]//td[1]"));
				
				System.out.print(element.getText()+" ");
			}
			}
			
		}
		
	}


