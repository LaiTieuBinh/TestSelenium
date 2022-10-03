package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageGoogle {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\kcs\\software\\chromedriver.exe");
		 
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.google.com.vn/");
	    
	    driver.manage().window().maximize();
	    
	    System.out.println(driver.getTitle());
	    
	    WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
	    
	    search.sendKeys("selenium");
	    
	    search.sendKeys(Keys.RETURN);
	    
//	    driver.quit();
	}

}
