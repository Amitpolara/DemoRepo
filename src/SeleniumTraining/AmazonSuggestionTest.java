package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSuggestionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watch");
		Thread.sleep(2000);
		
		List<WebElement> drop = driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']/div/div"));
		System.out.println(drop.size());
		
		for (WebElement A : drop) {
			System.out.println(A.getText());
		}

	}

}
