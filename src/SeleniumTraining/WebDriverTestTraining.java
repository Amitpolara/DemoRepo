package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTestTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("fhuebcbbcbcbcjdcj");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("gvscvgvctqwuq");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		

	}

}
