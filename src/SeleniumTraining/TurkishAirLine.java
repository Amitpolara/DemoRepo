package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TurkishAirLine {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.canadapost-postescanada.ca/sam/account_register.aspx");
		
		driver.findElement(By.id("EmailAddress")).sendKeys("bahhbhabhbh@gmail.com");
		driver.findElement(By.id("PasswordField")).sendKeys("Amit@patel");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Amit@patel");
		driver.findElement(By.xpath("//input[@id='ctl00_phForm_Eletter']")).click();	
		
		driver.findElement(By.id("FirstName")).sendKeys("anaum");
		driver.findElement(By.id("LastName")).sendKeys("nanjnzjnja");
		driver.findElement(By.id("Company")).sendKeys("canada post");
		List<WebElement> m = driver.findElements(By.xpath("//select[@id='Industry']/option"));		
		System.out.println(m.size());
		for (WebElement A :m) {
			System.out.println(A.getText());
		}
		
		WebElement option = driver.findElement(By.xpath("//select[@id='Industry']"));
		Select S = new Select(option);
		
		Thread.sleep(2000);
		S.selectByIndex(4);
		
		driver.findElement(By.id("Address1")).sendKeys("124 kapodra char rasta");
		driver.findElement(By.id("City")).sendKeys("Surat");
		
		List<WebElement> province = driver.findElements(By.xpath("//select[@id='provinceList']/option"));
		System.out.println(province.size());
		
		WebElement prov = driver.findElement(By.xpath("//select[@id='provinceList']"));
		Select pro = new Select(prov);
		pro.selectByVisibleText("Ontario (ON)");
		
		driver.findElement(By.id("ZipCode")).sendKeys("N0H2C4");
		driver.findElement(By.id("DirectLine")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='DirectLineExt']")).sendKeys("+1");
		driver.findElement(By.id("chkPrivacy")).click();
		
		driver.findElement(By.id("btnCreateMyAccount")).click();		
	}

}
