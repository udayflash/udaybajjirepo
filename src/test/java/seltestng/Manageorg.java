package seltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Manageorg {
    WebDriver driver;
    @Test
	public void Organizer() throws InterruptedException {
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
//	driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(18) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//mat-icon[normalize-space()='file_copy']")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//div[normalize-space()='Archived']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Name ']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Name ']//i[normalize-space()='arrow_upward']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Name ']//i[normalize-space()='arrow_downward']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Created On ']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Created On ']//i[normalize-space()='arrow_upward']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Created On ']//i[normalize-space()='arrow_downward']")).click();
    Thread.sleep(2000);
    Actions acton = new Actions(driver);
    WebElement orgow = driver.findElement(By.xpath("//mat-row[@class='mat-mdc-row mdc-data-table__row cdk-row ng-star-inserted'][3]"));
    acton.moveToElement(orgow).perform();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='edit'])[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys(Keys.NUMPAD3);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys(Keys.NUMPAD9);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
    }
}
