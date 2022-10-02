package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BritaSiteTest {

	

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.brita.ca/");
		
		/*Thread.sleep(2000);
		WebElement pitcher = driver.findElement(By.xpath("(//div[@class='bottom'])[3]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", pitcher);*/
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		/*here link text not work --> where to buy <--;*/
		/*Thread.sleep(2000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.xpath("//nav[@id='nav--desktop']/ul/li[3]")).click();
		
		List<WebElement> where = driver.findElements(By.xpath("//div[@class='where-to-buy__shops columns-three']/ul/li"));
		System.out.println(where.size());
		
		for (WebElement buy : where) {
			System.out.println(buy.getText());
			}*/
		
		/*List<WebElement> call = driver.findElements(By.xpath("//div[@class='flex container-inner']/section[3]/ul/li"));
		System.out.println(call.size());
		
		for (int i=0; i<call.size(); i++) {
			System.out.println(call.get(i).getText());
		}*/
		
		driver.findElement(By.xpath("//nav[@id='nav--utility']/ul/li[1]")).click();
		driver.findElement(By.id("pc_firstName")).sendKeys("amit");
		driver.findElement(By.id("pc_lastName")).sendKeys("patel");
		driver.findElement(By.id("user_email")).sendKeys("sbbsbxb");
		driver.findElement(By.id("pass1")).sendKeys("bshb1w");
		//driver.findElement(By.id("pc_brandOptIn")).click();
		//driver.findElement(By.className("wp-submit")).click();
		
		String expected = "Please enter an email address.";
		String actual = driver.findElement(By.xpath("//ul[@id='parsley-id-9']/li[1]")).getText();
		
		if (expected.equals(actual)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}

		
		
	}

}
