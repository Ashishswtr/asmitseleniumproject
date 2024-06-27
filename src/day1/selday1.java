package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class selday1 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
			driver.navigate().back();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
