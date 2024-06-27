package testngday3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.All_data;

public class Practice implements All_data {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	void Launch_browser(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("Incorrect Browser");
		}
		driver.get(url);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}
	@Test
	void check_home_page_visible_successfully()
	{
		String visible_text = driver.findElement(xpath_visible).getText();
		System.out.println(visible_text);
		if(visible_text.equals("FEATURES ITEMS"))
		{
			System.out.println("test case pass");
		}
		else {
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
