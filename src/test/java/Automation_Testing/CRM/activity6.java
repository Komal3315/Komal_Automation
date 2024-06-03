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

public class activity6 {
	
	@Test
	public static void task6()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
		
		WebElement userName_textbox  = driver.findElement(By.id("user_name"));
		WebElement password_textbox  = driver.findElement(By.id("username_password"));
		WebElement login_button  = driver.findElement(By.id("bigbutton"));
		
		userName_textbox.sendKeys("admin");
		password_textbox.sendKeys("pa$$w0rd");
		login_button.click();
		
		WebElement activities_Opt  = driver.findElement(By.id("grouptab_3"));
	
		boolean displayResul = activities_Opt.isDisplayed();
		
		if(displayResul)
		{
			System.out.println("Element Present");
		}
		else
		{System.out.println("Element not Present");}
		
		
		driver.quit();
		
	}
	
	

}
