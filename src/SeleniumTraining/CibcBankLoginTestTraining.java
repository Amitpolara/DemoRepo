package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CibcBankLoginTestTraining {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		WebElement ddrop = driver.findElement(By.id("Form_submitForm_Country"));
		Select select = new Select(ddrop);
		
		select.selectByIndex(6);
		
		Thread.sleep(2000);
		
		select.selectByValue("American Samoa");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Andorra");*/
		
		driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		WebElement ddrop = driver.findElement(By.id("multi-select"));
		Select select = new Select(ddrop);
		
		select.selectByIndex(4);
		
		Thread.sleep(2000);
		
		select.selectByValue("Florida");
		
		Thread.sleep(2000);
		
		select.selectByVisibleText("Pennsylvania");
		
		 List<WebElement> alllist = select.getAllSelectedOptions();
		 System.out.println(alllist.size());
		 
		select.deselectAll();
		Thread.sleep(2000);
		 
		select.selectByValue("Florida");
		Thread.sleep(2000);	
		
			
		select.selectByVisibleText("Pennsylvania");
		Thread.sleep(2000); 
		
		select.deselectByIndex(4);
		Thread.sleep(2000); 
		 
		 List<WebElement> alllist1 = select.getAllSelectedOptions();
		 System.out.println(alllist1.size());
		
		
		
	}}