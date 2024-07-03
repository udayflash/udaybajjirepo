package seltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Esignlists {
    WebDriver driver;
    public Esignlists() {
    	driver = new ChromeDriver();
    } 
    @Test
	public void listsEsign() throws InterruptedException {
    	driver.manage().window().maximize();
	    driver.get("https://test.qount.io");
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
	 	driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
	 	driver.findElement(By.xpath("//button[@type='submit']")).click();
	 	Thread.sleep(5000);
	 	driver.findElement(By.xpath("//span[text()='# eSignatures']")).click();
	 	Thread.sleep(4000);
    	driver.findElement(By.xpath("//mat-icon[normalize-space()='cancel']")).click(); 
    	Thread.sleep(6000);
    	driver.findElement(By.xpath("//div[normalize-space()='Expired']")).click(); 
    	Thread.sleep(6000);
    	driver.findElement(By.xpath("//div[normalize-space()='Signed']")).click();
    	Thread.sleep(6000);
    	driver.findElement(By.xpath("//div[normalize-space()='Done']")).click(); 
    	Thread.sleep(6000);
    	driver.findElement(By.xpath("//div[normalize-space()='Archived']")).click(); 
	}
}
