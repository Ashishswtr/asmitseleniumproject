package utility;

import org.openqa.selenium.By;

public interface All_data {
	String url = "https://automationexercise.com";

     By xpath_visible = By.xpath("//h2[contains(text() , 'Features Items')]");
     
     By signup_link = By.linkText("signup / login");
	
}
