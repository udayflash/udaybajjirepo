package seldrive;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Projselen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String URL = "http://omayo.blogspot.com";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.id("alert1")).click();
	    Alert alert = driver.switchTo().alert();
		String message = alert.getText();
		System.out.println(message);
		alert.accept();
	}
}
