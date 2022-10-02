package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayDropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		
		
		List<WebElement> category = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(category.size());
		
		for (int i=0; i<category.size(); i++) {
			System.out.println(category.get(i).getText()+"---------"+category.get(i).isSelected());
		}
		
		System.out.println("--->---->---->----->---->");
			
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select s = new Select(dropdown);
		
		s.selectByValue("267");
		
		for (int i=0; i<category.size(); i++) {
			System.out.println(category.get(i).getText()+"---------"+category.get(i).isSelected());
			}
		
		}
	}
	
	

		
	


