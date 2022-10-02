package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeTrainingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://best.aliexpress.com/?dp=ca652125598d342350763ee55edf1615&af=2015&aff_fcid=590e93cf6abb4a488ff51d38c39e634c-1658676110088-01291-nAeYz7Y&aff_fsk=nAeYz7Y&aff_platform=link-c-tool&sk=nAeYz7Y&aff_trace_key=590e93cf6abb4a488ff51d38c39e634c-1658676110088-01291-nAeYz7Y&terminal_id=aa6bb9bd6a06492a934cfd8dac3333b2&afSmartRedirect=y");
		
		driver.findElement(By.id("search-key")).getAttribute("placeholder");
		
		String S = driver.findElement(By.id("search-key")).getAttribute("placeholder");
		
		System.out.println(S);
		
		driver.findElement(By.id("search-key")).sendKeys("Apple Watch");
		
		String p = driver.findElement(By.id("search-key")).getAttribute("value");
		System.out.println(p);
		
		
	}

}
