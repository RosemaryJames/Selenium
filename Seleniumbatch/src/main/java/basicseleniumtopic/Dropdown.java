package basicseleniumtopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement dropDown= driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select object =new Select(dropDown);
		object.selectByIndex(1);
		object.selectByVisibleText("Yellow");
		object.selectByValue("Green");
		WebElement selectedElements=object.getFirstSelectedOption();
		String selectedOption=selectedElements.getText();
		System.out.println(selectedOption);
		WebElement multiDropDown =driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select multiObject =new Select(multiDropDown);
		for(int i=0;i<3;i++)	
		{
			multiObject.selectByIndex(i);
		}
		List<WebElement> list1 =multiObject.getAllSelectedOptions();
		for(int j=0;j<list1.size();j++)
		{
		System.out.println(list1.get(j).getText());	
		}
		
	}

}
