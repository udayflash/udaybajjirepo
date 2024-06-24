package seltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Esignflow {
    WebDriver driver;
    @Test
	public void Eflow() throws InterruptedException {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://test.qount.io");
	     Thread.sleep(4000);
	     driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
	 	 driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
	 	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 	 Thread.sleep(5000);
	 	 driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(15) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
	 	 Thread.sleep(4000);
	 	 WebElement iscroll = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[10]"));
	 	 //WebElement iscroll = driver.findElement(By.xpath("(//cdk-virtual-scroll-viewport[@class='cdk-virtual-scroll-viewport view-port ng-tns-c147-12 cdk-virtual-scrollable cdk-virtual-scroll-orientation-vertical'])[1]"));
	 	 JavascriptExecutor Jscr = (JavascriptExecutor) driver;
	 	 Jscr.executeScript("arguments[0].scrollIntoView(true);",iscroll);
	 	 Thread.sleep(2000);
	 	 driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[7]")).click();
	 	 Thread.sleep(4000);
	 	 driver.findElement(By.xpath("//span[normalize-space()='E-Sign Flow']")).click();
	 	 Thread.sleep(4000);
	 	 driver.findElement(By.xpath("(//span[@class='mat-mdc-button-touch-target'])[32]")).click();
    }
}
