package seldrive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = "https://test.qount.io";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("bajjiuday@yahoo.in");
		driver.findElement(By.cssSelector("#input__password")).sendKeys("Qount-uday18");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.findElement(By.cssSelector("body > app-root > div.wall-customer.wallTheme > div.expanded > div.small-2.sidebar.expandSidebar.ng-star-inserted > customer-side-bar > div.h-100.w-100.wall-nav.ng-star-inserted > mat-selection-list > mat-list-option:nth-child(7) > span > span > span")).click();
		// body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) >
		// div:nth-child(1) > customer-side-bar:nth-child(1) > div:nth-child(2) >
		// mat-selection-list:nth-child(1) > mat-list-option:nth-child(7) >
		// span:nth-child(1) > span:nth-child(1) > span:nth-child(1)
	}
}
