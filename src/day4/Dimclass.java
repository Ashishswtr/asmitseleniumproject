package day4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimclass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Dimension dimension = new Dimension(300, 500);
		driver.manage().window().setSize(dimension);
		
		Point p = new Point(100, 200);
		driver.manage().window().setPosition(p);

	}

}
