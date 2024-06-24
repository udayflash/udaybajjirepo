package seltestng;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Qountestng {
   WebDriver driver;
	@BeforeTest
	public void testorg() {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get(URL);
	}
		@Test
		public void qountng()  {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://test.qount.io");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("bajjiuday@yahoo.in");
		driver.findElement(By.cssSelector("#input__password")).sendKeys("Qount-uday18");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String cururl = driver.getCurrentUrl();
		System.out.println(cururl);
		
		String tilt = driver.getTitle();
		System.out.println(tilt);
		
		String pgsource = driver.getPageSource();
		System.out.println(pgsource);
		
		//Thread.sleep(2000);
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		//driver.findElement(By.cssSelector("body > app-root > div.wall-customer.wallTheme > div.expanded > div.small-2.sidebar.expandSidebar.ng-star-inserted > customer-side-bar > div.h-100.w-100.wall-nav.ng-star-inserted > mat-selection-list > mat-list-option:nth-child(7) > span > span > span")).click();
		// body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) >
		//driver.close();
		}
		/*@AfterTest
	    public void closeChrome() {
		System.out.println("Close Chrome");
		driver.quit();
		} */
}
