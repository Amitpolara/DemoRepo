package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AliBabaLinkTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/amitkumarpolara/Desktop/SELENIUMJARS/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.alibaba.com/?src=sem_ggl&from=sem_ggl&cmpgn=9922923052&adgrp=135429399773&fditm=&tgt=kwd-14739453&locintrst=&locphyscl=1002392&mtchtyp=e&ntwrk=g&device=c&dvcmdl=&creative=593583291491&plcmnt=&plcmntcat=&p1=&p2=&aceid=&position=&localKeyword=alibaba&gclid=Cj0KCQjw852XBhC6ARIsAJsFPN1zqfIL7cmgqsbwD7jEMOvd92Gf15Gc573G6qOKX-hyiSRK883t0t4aAo9lEALw_wcB");

		List<WebElement> footer = driver.findElements(By.xpath("//div[@class='ui-footer-sitemap util-clearfix']/div[*]/dl/dd/a"));
		System.out.println(footer.size());
		
		for (int i = 0; i<footer.size(); i++)
		System.out.println(footer.get(i).getText());
		
		driver.findElement(By.xpath("//div[@class='left-market']/a[1]")).click();
	
		
	}

}
