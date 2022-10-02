package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignUpTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.findElement(By.name("lastName")).sendKeys("dhanadhan");
		
		driver.findElement(By.id("username")).sendKeys("sdferrettet");
		
		driver.findElement(By.name("Passwd")).sendKeys("frfrf12@");
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("frfrf12@");
		
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		
	}

}
