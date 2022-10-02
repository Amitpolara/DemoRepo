package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirCanadaRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.aircanada.com/ca/en/aco/home.html");
		Thread.sleep(6000);
		
		List<WebElement >radio = driver.findElements(By.xpath("//div[@class='abc-radio-group-horizontal-align abc-radio-group-wrapper']/abc-radio-button"));
		System.out.println(radio.size());
		
		for(WebElement buttton :radio ) {
			System.out.println(buttton.getAttribute("value")+"       "+buttton.isSelected());
		}
		
		radio.get(0).click();

		for(WebElement buttton :radio ) {
			System.out.println(buttton.getAttribute("value")+"       "+buttton.isSelected());
		}
	driver.findElement(By.xpath("//input[@id='bkmgFlights_origin_trip_1']")).sendKeys("yyz");
	driver.findElement(By.xpath("//input[@id='bkmgFlights_destination_trip_1']")).sendKeys("bom");
	driver.findElement(By.xpath("//input[@id='bkmgFlights_travelDates_1-formfield-1']")).sendKeys("12/01/2023");
	driver.findElement(By.xpath("//input[@id='bkmgFlights_travelDates_1-formfield-1']")).sendKeys("25/01/2023");
	
	
	
	
	
	}

}
