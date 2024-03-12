package basicseleniumtopic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basicselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//String s=driver.getPageSource();
		//System.out.println(s);
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
				
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close();//current tab close 
		driver.quit();//close all windows
	}

}
