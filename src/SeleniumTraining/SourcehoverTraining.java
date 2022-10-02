package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SourcehoverTraining {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.source.ca/");
		//driver.manage().timeouts().implicitlyWait(20);
		
		Thread.sleep(3000);
		WebElement move = driver.findElement(By.xpath("//nav[@aria-label='Desktop Navigation']/div/ul/li[2]"));
		Actions builders = new Actions(driver);
		builders.moveToElement(move).build().perform();
		
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='grid-item'])[9]/ul/li"));
		System.out.println(list.size());
		
		for(WebElement all : list) {
			System.out.println(all.getText());
			
		}
		

	}

}
