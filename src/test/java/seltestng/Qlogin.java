package seltestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Qlogin {
    WebDriver driver;
	@Test
	public void logqnt() {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.qount.io");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
		driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
