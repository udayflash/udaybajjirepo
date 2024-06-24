package seltestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class urlTest {
	WebDriver driver;
  @Test
  public void f() {
	  String baseUrl = "https://www.toolsqa.com/";
	  System.out.println("Launching Chrome browser");
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
	  String testTitle = "Tools QA";
	  String originalTitle = driver.getTitle();
	  Assert.assertEquals(originalTitle, testTitle);
  }
  
	/*  public void g() {
		  String baseUrl = "https://www.toolsqa.com/";
		  System.out.println("Launching Chrome browser");
		  driver = new ChromeDriver();
		  driver.get(baseUrl);
		  String testTitle = "Free QA Automation tools";
		  String originalTitle = driver.getTitle();
		  Assert.assertEquals(originalTitle, testTitle);
	  } */
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting Test on Chrome browser");
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  System.out.println("Finished test on Chrome browser");
  }
}
