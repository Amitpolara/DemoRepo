package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookLoginTestTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://chromedriver.chromium.org/ -->for parita
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("fhuebcbbcbcbcjdcj");
		
		driver.findElement(By.id("pass")).sendKeys("gvscvgvctqwuq");
		
		driver.findElement(By.name("login")).click();

	}

}
