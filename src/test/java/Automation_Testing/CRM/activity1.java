package Automation_Testing.CRM;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class activity1 {
	
	@Test
	public static void task1()
	
	{		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		if (title.equals("SuiteCRM"))
		{
			System.out.println("Title is "+title);
		}
		else
		{
			System.out.println("Title is not correct title "+title);
			
		}
		driver.quit();
		
	}
	
	

}
