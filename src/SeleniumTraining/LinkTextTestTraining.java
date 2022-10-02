package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkTextTestTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.ca/");
		
		driver.findElement(By.partialLinkText("Abo")).click();

	}

}
