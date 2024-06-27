package day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondscript {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	
		
		driver.get(null);
		Thread.sleep(3000);
		
		Dimension dim = new Dimension(300, 600);
		driver.manage().window().setSize(dim);
		Point point = new Point(300, 600);
		driver.manage().window().setPosition(point);
		
	System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
	}

}
