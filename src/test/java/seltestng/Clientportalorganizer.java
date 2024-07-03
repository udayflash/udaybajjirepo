package seltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clientportalorganizer {
    WebDriver driver;
    @Test
	public void answerorg() throws InterruptedException {
		// TODO Auto-generated method stub
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://test.qount.io");
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udaykrone@gmail.com");
	driver.findElement(By.id("input__password")).sendKeys("Qount@123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//span[text()=' # Questionnaires ']")).click();
		
	}
}
