package seltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sendorganizer {
    WebDriver driver;
    @Test
	public void clientsend() throws InterruptedException {
		// TODO Auto-generated method stub
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://test.qount.io");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
	driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[normalize-space()='Send']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space()='Send to Client']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys("Croatia");
	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys(Keys.ENTER);	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys("Mighty enterprises pvt");
	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='delete'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-1-button'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-1-button'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-2-button'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-2-button'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	Thread.sleep(3000);
//	driver.findElement(By.xpath("//mat-label[normalize-space()='Subject']")).sendKeys("Sub email organizer automate");
  //  Thread.sleep(2000);
 //   driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ARROW_UP);
    Thread.sleep(2000);
  //  driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ARROW_UP);
 //   driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//mat-icon[normalize-space()='assignment']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[normalize-space()='8th August']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[normalize-space()='Select']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("(//span[normalize-space()='Send'])[2]")).click(); 
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[normalize-space()='Save as Draft']")).click();
    }
}
