package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BulkBarnFooterLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bulkbarn.ca/home-en/index_ON_QC.html");
		
		List<WebElement> bulk = driver.findElements(By.xpath("//div[@class='row']/div[*]/ul/li"));
		System.out.println(bulk.size());
		
		for (WebElement a : bulk) {
			System.out.println(a.getText());
		}

		
	}

}
