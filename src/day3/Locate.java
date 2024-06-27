package day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("my-text-id")).sendKeys("Ashish");
		driver.findElement(By.name("my-password")).sendKeys("ABCD");
		driver.findElement(By.linkText("Return to index")).click();
		driver.navigate().back();
		
		WebElement we_dropdown = driver.findElement(By.name("my-select"));
		
		Select sel = new Select(we_dropdown);
		sel.selectByVisibleText("Two");
		
		driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button")).click();

	}

}
