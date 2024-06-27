package automation_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.All_data;

public class Register implements All_data{
	WebDriver driver;
	@BeforeTest
	void Launch_browser() throws InterruptedException
	{
		 driver = new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 }
	@Test
	void check_home_page_visible_successfully()
	{String visible_text = driver.findElement(xpath_visible).getText();
	System.out.println(visible_text);
	
	if(visible_text.equals("FEATURES ITEMS"))
	{
		System.out.println("test case pass");
	}
	else 
	{
	  System.out.println("test case fail");
	}}
	@Test
	void signup_login()
	{
		driver.findElement(signup_link).click();
	}
	
	void closed()
	{
		driver.close();
	}
	
}






