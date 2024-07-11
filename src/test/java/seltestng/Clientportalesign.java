package seltestng;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Clientportalesign {
    WebDriver driver;
    private By iframe;
    @Test
	public void portalesign() throws InterruptedException {
		// TODO Auto-generated method stub
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://test.qount.io");
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udaykrone@gmail.com");
	driver.findElement(By.id("input__password")).sendKeys("Qount@123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//span[text()=' # eSignatures ']")).click();
//	Thread.sleep(15000);
	TimeUnit.SECONDS.sleep(25);
	driver.findElement(By.xpath("(//span[normalize-space()='Esign64trail'])[1]")).click();
//	driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > customer-side-bar:nth-child(1) > div:nth-child(2) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(7) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
    Thread.sleep(6000);
	driver.findElement(By.xpath("(//span[contains (text(),' Next ')])[1]")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//span[contains (text(),' Next ')])[1]")).click();
	TimeUnit.SECONDS.sleep(12);
//	driver.findElement(By.xpath("(//span[contains (text(),'Previous')])[1]")).click();
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("(//span[contains (text(),' Skip and Pay Later ')])[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("(//span[contains (text(),' Next ')])[1]")).click();
//	Thread.sleep(13000);
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Required']")).click();
	Thread.sleep(3000);
    driver.findElement(By.xpath("(//button[@id='action-bar-btn-continue'][contains(text(),'Continue')])")).click();
    Thread.sleep(5000);
    Actions signin = new Actions(driver);
    WebElement signer = driver.findElement(By.xpath("//div[normalize-space()='Sign']"));
    signin.moveToElement(signer).perform();
    Thread.sleep(3000);
    signin.click(signer);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[normalize-space()='Sign']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//button[normalize-space()='Finish']")).click();
    }
}