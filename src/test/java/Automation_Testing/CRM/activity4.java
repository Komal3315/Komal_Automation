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

public class activity4 {
	
	
	@Test
	public static void task4()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
		
		WebElement userName_textbox  = driver.findElement(By.id("user_name"));
		WebElement password_textbox  = driver.findElement(By.id("username_password"));
		WebElement login_buttin  = driver.findElement(By.id("bigbutton"));
		
		userName_textbox.sendKeys("admin");
		password_textbox.sendKeys("pa$$w0rd");
		login_buttin.click();
		
	   String 	expected_url = "https://alchemy.hguy.co/crm/index.php?module=Home&action=index";
	   
	   
	   String current_url = driver.getCurrentUrl();
	   
	   System.out.println(current_url);
	   System.out.println(expected_url);
	   
	   if(expected_url.equalsIgnoreCase(current_url))
	   {
	   
	   System.out.println("Successfully navigate to home page ");
	   }
	   else {System.out.println("Not successfully navigate to home page ");}
		 
		
		driver.quit();
		
	}
	
	

}
