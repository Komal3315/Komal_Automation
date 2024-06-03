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

public class activity5 {
	
	@Test
	public static void task5()
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
		
		WebElement toolBar = driver.findElement(By.xpath("//div[@id='toolbar']"));
		String toolBar_color = toolBar.getCssValue("color");
		
		System.out.println(toolBar_color);
		
		String expected_colorCode = "rgba(83, 77, 100, 1)";
		
		if(expected_colorCode.equalsIgnoreCase(toolBar_color))
		{
			System.out.println("Color Code is expected Color ");
		}
		else {System.out.println("Color is not expected Color ");}
	  
	
		driver.quit();
		
	}
	

}
