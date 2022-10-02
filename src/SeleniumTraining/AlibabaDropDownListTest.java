package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlibabaDropDownListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.alibaba.com/?src=sem_ggl&from=sem_ggl&cmpgn=9922923052&adgrp=135429399773&fditm=&tgt=kwd-14739453&locintrst=&locphyscl=1002392&mtchtyp=e&ntwrk=g&device=c&dvcmdl=&creative=593583291491&plcmnt=&plcmntcat=&p1=&p2=&aceid=&position=&localKeyword=alibaba&gclid=Cj0KCQjw852XBhC6ARIsAJsFPN1zqfIL7cmgqsbwD7jEMOvd92Gf15Gc573G6qOKX-hyiSRK883t0t4aAo9lEALw_wcB");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui-searchbar-keyword']")).sendKeys("watch");
		Thread.sleep(2000);
		
		List<WebElement> watchlist = driver.findElements(By.xpath("//input[@class='ui-searchbar-keyword']"));
		System.out.println(watchlist.size());
		
		for (WebElement a :watchlist) {
			System.out.println(a.getText());
		}
		
		
	}

}
