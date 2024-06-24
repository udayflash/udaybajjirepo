package clientoutreach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Esignlistpage {
	WebDriver driver;
	public Esignlistpage(WebDriver driver) {
	this.driver = driver;	
    driver = new ChromeDriver();
    }
	public void listsEsign() throws InterruptedException {
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

