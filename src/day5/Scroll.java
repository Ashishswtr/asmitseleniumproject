package day5;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		
	
		Dimension dimension = new Dimension(300, 650);
		driver.manage().window().setSize(dimension);
		Thread.sleep(4000);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("Window.scrollBy(0 , 1000)");
		
		
		
		try {
			File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(f, new File("C:\\Users\\Ashish Chauhan\\Desktop\\SS\\image.png"));
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
