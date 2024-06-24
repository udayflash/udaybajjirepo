package seltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Answerorg {
    WebDriver driver;
    @Test
	public void organise() throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://test.qount.io");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
		driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(18) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
		Thread.sleep(5000);
		Actions actoned = new Actions(driver);
		    WebElement orgrown = driver.findElement(By.xpath("(//td[normalize-space()='All Qs DLs 85 dup'])[1]"));
		    actoned.moveToElement(orgrown).perform();
		    Thread.sleep(4000);
			driver.findElement(By.xpath("(//td[normalize-space()='All Qs DLs 85 dup'])[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[normalize-space()='In Progress']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[normalize-space()='Bullvice ledgers']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//mat-card[@class='mat-mdc-card mdc-card py-0'])[1]//span[normalize-space()='Subhash']")).click();
			Thread.sleep(6000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,550)", "");
	//		WebElement iscrolls = driver.findElement(By.xpath("/html/body/app-root/div[1]/div[2]/div[2]/app-client-answers-qs/div/div/div[2]/mat-tab-group/div/mat-tab-body[4]"));
		 	 //WebElement iscroll = driver.findElement(By.xpath("(//cdk-virtual-scroll-viewport[@class='cdk-virtual-scroll-viewport view-port ng-tns-c147-12 cdk-virtual-scrollable cdk-virtual-scroll-orientation-vertical'])[1]"));
	//	 	JavascriptExecutor Jscrpt = (JavascriptExecutor) driver;
	//	 	Jscrpt.executeScript("arguments[0].scrollIntoView(true);",iscrolls);
		 	Thread.sleep(5000);
			//driver.findElement(By.xpath("//label[@class='container d-flex mt-2 ng-star-inserted'][3]/span[normalize-space()='False']/following-sibling::input[@type='radio']")).click();
			driver.findElement(By.xpath("(//div[@class='flex-grow-1 qs-card mb-2 c-pointer'])[3]//span[normalize-space()='False']//span[@class='checkmark']")).click();
			//driver.findElement(By.xpath("(//label[@class='container d-flex mt-2 ng-star-inserted'])[3]/span[normalize-space()='False']/following-sibling::input[@type='radio']")).click();
	//		(//div[@class='flex-grow-1 qs-card mb-2 c-pointer'])[2]
	//		(//mat-card[@class='mat-mdc-card mdc-card py-0'])[3]
    }
}
