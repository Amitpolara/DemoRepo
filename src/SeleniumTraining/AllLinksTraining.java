package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllLinksTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://uwaterloo.ca/health/future-graduate-students/access-our-graduate-studies-guide?gclid=EAIaIQobChMIrMe_9tGN-QIVOD6tBh3tXwjOEAAYASAAEgK0fvD_BwE");
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println(alltags.size());
		
		for (int i=0; i<alltags.size();i++) {
			System.out.println("Liks are on page:- " +alltags.get(i).getAttribute("href"));
			System.out.println("Links are on page:-  " + alltags.get(i).getText() );
			
		}
		
	}

}
