package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AliExpressDropTestTraining {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");

		
		List<WebElement> drop = driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		System.out.println(drop.size());
		
		for(WebElement down : drop) {
			if(down.isSelected())
			System.out.println(down.getText()+"           "+down.isSelected());
		}
		System.out.println("------->@----@<-------");
		
		WebElement to = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(to);
		
		s.selectByValue("search-alias=baby");
		
		for(WebElement down : drop) {
			
			if (down.isSelected())
			System.out.println(down.getText()+"           "+down.isSelected());
		}
		
		
	}

}
