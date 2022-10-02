package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdidasHoverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.adidas.ca/en?cm_mmc=AdiSEM&gclid=EAIaIQobChMIh76ns7az-QIVdMyzCh0ZUAwOEAAYASAAEgKEyPD_BwE&gclsrc=aw.ds");
		
		Actions builder = new Actions(driver);
		WebElement kids = driver.findElement(By.xpath("//div[@class='main-menu___1xu8m']/div[3]"));
		builder.moveToElement(kids).build().perform();
		
		List<WebElement> kshoes = driver.findElements(By.xpath("//div[@class='main-line']/div[3]/ul/li"));
		System.out.println(kshoes.size());
		
		for (WebElement s : kshoes) {
			System.out.println(s.getText());
		}
		

	}

}
