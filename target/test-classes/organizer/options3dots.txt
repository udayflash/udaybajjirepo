package seltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Orgcases {
    WebDriver driver;
    @Test
	public void orgzer() throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://test.qount.io");
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
		driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
//		driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(18) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
		Thread.sleep(5000);
		Thread.sleep(2000);
	    Actions actoned = new Actions(driver);
	    WebElement orgrown = driver.findElement(By.xpath("(//td[normalize-space()='All Qs DLs 85 dup'])[1]"));
	    actoned.moveToElement(orgrown).perform();
	    Thread.sleep(4000);
		driver.findElement(By.xpath("(//td[normalize-space()='All Qs DLs 85 dup'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[normalize-space()='Sent']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='MFA Settings']")).click();
		Thread.sleep(4000);
		//JavascriptExecutor mfajse = (JavascriptExecutor) driver;
		//driver.findElement(By.xpath("//button[@id='mat-mdc-slide-toggle-4-button']//div[@class='mdc-switch__handle']")).click();
		//JavascriptExecutor mfajs = (JavascriptExecutor) driver;
		//mfajs.executeScript("document.getElementById('mat-mdc-slide-toggle-4-button').click()");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Activity']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Resend']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Set Reminder']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Delete']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
    }
}
