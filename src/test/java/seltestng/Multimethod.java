package seltestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multimethod {
	WebDriver driver;
	@AfterMethod
	public void quitQt() {
		driver.quit();
	}
	@BeforeMethod
	public void LoginQt() throws InterruptedException {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://test.qount.io");
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
		driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(15) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
		Thread.sleep(4000);
	}
	@Test(priority=1)
	public void secrlink() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("(//div[@class='g-table']//mat-icon[@mattooltip='Open Secure Link' and starts-with(@class,'mat-icon')][1])[8]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/lib-secure-link[1]/mat-dialog-content[1]/div[1]/div[2]/div[1]/div[2]/div[1]/u[1]/p[1]")).click();
		Thread.sleep(15000);
	}
	@Test(priority=2)
	public void dwnldoc() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='g-table']//mat-icon[@mattooltip='Download' and starts-with(@class,'mat-icon')][1])[10]")).click();	
	Thread.sleep(9000);
	}
    @Test(priority=3)
	public void invceray() throws InterruptedException {
    	driver.findElement(By.xpath("(//div[@mattooltip='View Invoice'])[3]")).click();
	    Thread.sleep(12000);
        }
    @Test(priority=4)
         	public void Setings() throws InterruptedException {
        	WebElement iscroll = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[4]"));
         	JavascriptExecutor Jscr = (JavascriptExecutor) driver;
         	Jscr.executeScript("arguments[0].scrollIntoView(true);" ,iscroll);
         	Thread.sleep(3000);
         	driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[6]")).click();
         	Thread.sleep(4000);
           	driver.findElement(By.xpath("//span[@class='mdc-list-item__primary-text']//span[normalize-space()='Settings']")).click();
           	Thread.sleep(6000);
           	driver.findElement(By.xpath("(//span[normalize-space()='Cancel'])[1]")).click();
           	Thread.sleep(2000);
    }
    @Test(priority=5)
            public void histry() throws InterruptedException {
    	    WebElement iscroll = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[4]"));
     	    JavascriptExecutor Jscr = (JavascriptExecutor) driver;
     	    Jscr.executeScript("arguments[0].scrollIntoView(true);" ,iscroll);
     	    Thread.sleep(3000);
     	    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[5]")).click();
     	    Thread.sleep(2000);
     	    driver.findElement(By.xpath("//span[normalize-space()='History']")).click();
     	    Thread.sleep(8000);
     	    driver.findElement(By.xpath("(//mat-icon[@class='mat-icon notranslate mt-3 fs-6 material-icons mat-ligature-font mat-icon-no-color'])[1]")).click();
     	    Thread.sleep(2000);
    }
    @Test(priority=6)
    public void Esignflow() throws InterruptedException {
    WebElement iscroll = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[6]"));
	 //WebElement iscroll = driver.findElement(By.xpath("(//cdk-virtual-scroll-viewport[@class='cdk-virtual-scroll-viewport view-port ng-tns-c147-12 cdk-virtual-scrollable cdk-virtual-scroll-orientation-vertical'])[1]"));
	 JavascriptExecutor Jscr = (JavascriptExecutor) driver;
	 Jscr.executeScript("arguments[0].scrollIntoView(true);",iscroll);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[7]")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//span[normalize-space()='E-Sign Flow']")).click();
	 Thread.sleep(7000);
	 driver.findElement(By.xpath("(//span[@class='mat-mdc-button-touch-target'])[32]")).click();
	 Thread.sleep(3000);
    }
    @Test(priority=7)
	public void Syncesign() throws InterruptedException {
	WebElement iscroll = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[2]"));
	JavascriptExecutor Jscr = (JavascriptExecutor) driver;
	Jscr.executeScript("arguments[0].scrollIntoView(true);" ,iscroll);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[4]")).click();
	//driver.findElement(By.xpath("//div[@class='g-table']//mat-icon[@role='img'][normalize-space()='more_vert'][normalize-space()='Prosignbug']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//span[@class='mdc-list-item__primary-text']//span[normalize-space()='Sync']")).click();
	Thread.sleep(4000);
    }
}
