package seltestng;

import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Esignseclink {
    WebDriver driver;
    JavascriptExecutor jsDriver;
	private By iframe;
    @Test
    public void securesign() throws InterruptedException {
		// TODO Auto-generated method stub
    driver = new ChromeDriver();
    jsDriver = (JavascriptExecutor) driver;
    driver.manage().window().maximize();
    driver.get("https://test.qount.io");
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
	driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(7000);
	driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(15) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
	//driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > lib-esignatures-lib:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > q-grid:nth-child(1) > div:nth-child(2) > qount-grid:nth-child(1) > div:nth-child(1) > div:nth-child(2) > cdk-virtual-scroll-viewport:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(13) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > mat-icon:nth-child(1)")).click();
    Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='g-table']//mat-icon[@mattooltip='Open Secure Link' and starts-with(@class,'mat-icon')][1])[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/lib-secure-link[1]/mat-dialog-content[1]/div[1]/div[2]/div[1]/div[2]/div[1]/u[1]/p[1]")).click();
	Thread.sleep(6000);
	String mainwindow = driver.getWindowHandle();
	Set<String> windowshift = driver.getWindowHandles();
	for(String esignwindow : windowshift) {
		driver.switchTo().window(esignwindow);
        Thread.sleep(3000);
		//		driver.close();
		String actualtitle = driver.getTitle();
		if(actualtitle.equals("Esignature")) {
			driver.findElement(By.xpath("(//span[contains (text(),' Next ')])[1]")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("(//span[contains (text(),' Next ')])[1]")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("(//span[contains (text(),'Previous')])[1]")).click();
			Thread.sleep(4000);
	//		driver.findElement(By.xpath("(//span[contains (text(),' Skip and Pay Later ')])[1]")).click();
	//		Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains (text(),' Next ')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains (text(),' Next ')])[1]")).click();
			Thread.sleep(13000);
			WebElement frameon = driver.findElement(iframe);    //iframe field
			driver.switchTo().frame(frameon);
			WebElement conton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div/div/div[4]/div/button"));
			conton.click();
	//		driver.findElement(By.xpath("(//button[@id='action-bar-btn-continue'][contains(text(),'Continue')])")).click();
   //         driver.findElement(By.cssSelector("button[id='action-bar-btn-continue']")).click();
//			driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
  //          driver.findElement(By.xpath("//button[@class='btn btn-main btn-lg'][normalize-space()='Continue']")).click();
//		    driver.findElement(By.id("action-bar-btn-continue")).click();
            Thread.sleep(8000);
			break;
		}
	}
	driver.switchTo().window(mainwindow);
/*	driver.findElement(By.xpath("/html/body/app-root/app-root/app-esign-flow/div[3]/div/button/span[2]")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/app-root/app-root/app-esign-flow/div[3]/div/button[2]/span[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/app-root/app-root/app-esign-flow/div[3]/div/button[1]/span[2]")).click();
} */
    }
    }