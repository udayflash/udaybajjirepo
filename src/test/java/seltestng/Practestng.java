package seltestng;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class Practestng {
	WebDriver driver;
	@Test
	public void autoprac() {
		// TODO Auto-generated method stub
		//@Test
	//	WebDriverManager.chromedriver.setup();
		String baseUrl = "https://www.toolsqa.com/";
		  System.out.println("Launching Chrome browser");
		  driver = new ChromeDriver();
		  driver.get(baseUrl);
		  String testTitle = "Tools QA";
		  String originalTitle = driver.getTitle();
		  assertEquals(testTitle, originalTitle);
	}
		  @BeforeMethod
		  public void beforeMethod()
		  {
			  System.out.println("Starting Test on Chrome browser");
		  }
		  @AfterMethod
		  public void afterMethod() {
			  driver.close();
			  System.out.println("Finished test on Chrome browser");
		  }
}
