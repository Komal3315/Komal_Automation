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
	@Test
	public static void task2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
		
		WebElement img_Element  = driver.findElement(By.xpath("//div/img"));
		
		String logoUrl = img_Element.getAttribute("src");
		
		System.out.println(logoUrl);
		driver.quit();
		
	}
	@Test
	public static void task3()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
		
		 WebElement copyright_element  = driver.findElement(By.id("admin_options"));
		 
		String copy_text = copyright_element.getText();
		
		System.out.println(copy_text);
		driver.quit();
		
	}
	
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
	@Test
	public static void task7()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
		WebDriverWait wait = null;
		
		WebElement userName_textbox  = driver.findElement(By.id("user_name"));
		WebElement password_textbox  = driver.findElement(By.id("username_password"));
		WebElement login_buttin  = driver.findElement(By.id("bigbutton"));		
		userName_textbox.sendKeys("admin");
		password_textbox.sendKeys("pa$$w0rd");
		login_buttin.click();
		
		WebElement hover_sales_button  = driver.findElement(By.id("grouptab_0"));
		
        Actions actions = new Actions(driver);

        actions.moveToElement(hover_sales_button).perform();
	
		driver.quit();
		
	}
	
	

}
