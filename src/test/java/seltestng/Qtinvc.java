package seltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Qtinvc {
    WebDriver driver;
    @Test
	public void viewinvce() throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://test.qount.io");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
    	driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//span[text()='# eSignatures']")).click();
   // 	driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(15) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//div[@mattooltip='View Invoice'])[3]")).click();
    }
}



