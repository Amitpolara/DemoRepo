package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTraining {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.prime.cibccm.com/IDP/");
		
		driver.findElement(By.name("txtUserName")).sendKeys("gxsvgvgs@huhuh");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtPassword_I")).sendKeys("gyvccbbchcbh");
		
		driver.findElement(By.className("dx-vam")).click();
		
		String expectedErr = "User does not exist. Please try correct user name. Please contact support for assistance.";
		String actualErr = driver.findElement(By.id("error")).getText();
		
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}

	}

}
