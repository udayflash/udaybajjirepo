package seltestng;
import org.testng.annotations.Test;
//import clientoutreach.ESignsyncpage;
//import clientoutreach.Esignlistpage;
import clientoutreach.Modulepage;
//import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Test
@Listeners(Listnertry.class)
public class Moduletest { // Renamed class to ModuleTest
	Modulepage modulepage;// Corrected class name
//	Esignlistpage esignstatus;
//	ESignsyncpage esignsync;

	@BeforeClass
	public void setup() {
		WebDriver driver = new ChromeDriver();
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		modulepage = new Modulepage(driver);
//		esignstatus = new Esignlistpage(driver);
	//	esignsync = new ESignsyncpage(driver);
	}
	public void verifyESign() throws InterruptedException {
		modulepage.loginqountweb();
		modulepage.esignpage();
		modulepage.esignflowpop();
		modulepage.historypop();
		modulepage.syncesigncloud();	
		modulepage.settingspop();
		modulepage.listesignstatus();
	}
}