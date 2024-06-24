package seltestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Createsign {
	WebDriver driver;
	JavascriptExecutor jsDriver;
	
	private By username = By.cssSelector("input[placeholder='Username']");
	private By password = By.id("input__password");
	private By submit = By.xpath("//button[@type='submit']");
	private By esignatures = By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(15) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
    private By createsignicon = By.xpath("//mat-icon[@class='mat-icon notranslate fs-4 mt-1 text-primary material-icons-outlined mat-icon-no-color']");
    private By reminderdrop = By.id("mat-select-2");
	private By reminderselect = By.cssSelector("#mat-option-1");
//	private By branddrop = By.xpath("//input[@id='mat-input-50']");
//	private By brandselect = By.xpath("//div[contains(text(),'Rolex')]");
	private By deletesigner = By.xpath("(//mat-icon[@role='img'][normalize-space()='delete'])[1]");
    private By labeldrop = By.xpath("//label[@id='mat-mdc-form-field-label-4']");
    private By labelselect = By.xpath("//span[normalize-space()='test']");
    private By uploaddoc = By.id("nativeEsignUpload");
    private By addinvoice = By.xpath("//label[contains(text(),'Add Invoice')]");
    private By skipandpay = By.xpath("//label[contains(text(),'Skip & Pay Later')]");
    private By next = By.xpath("//button[normalize-space()='Next']");
    private By uploadpredoc = By.id("nativePreDocUpload");
    private By notestemplate = By.xpath("//mat-icon[@mattooltip='Pick Notes Template']");
    private By notestempselect = By.xpath("//div[@class='mat-mdc-tooltip-trigger badge-menu-item ng-star-inserted'][normalize-space()='8th August']");
    private By emailtemplate = By.xpath("//mat-icon[@mattooltip='Pick Email Template']");
    private By markemailtemp = By.xpath("//span[normalize-space()='8th August']");
    private By selecttemp = By.xpath("//button[@class='template-submit text-white fs-8 letter-space-initial mt-3 mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base']//span[@class='mdc-button__label']");
    private By submitform = By.xpath("//button[normalize-space()='Submit']");
    private By iframe = By.xpath("//div[@class='row']//iframe");
    private By nextframe = By.xpath("//button[@class='olv-button olv-ignore-transform css-1n4kelk']");
    private By signfield = By.xpath("//button[@class='css-102gvct']");
    private By sendwofield = By.xpath("//button[@class='olv-button olv-ignore-transform css-4es3us']");
    private By clickdoc = By.xpath("//div[@class='css-i4r1gi']");
    private By receipientdroplist = By.xpath("//button[@data-qa='recipient-selector']");
    //    private By paylineitems = By.xpath("//mat-icon[starts-with(@class,'mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color ng-tns-c16-')]");
   
    public Createsign() {
			driver = new ChromeDriver();
			jsDriver = (JavascriptExecutor) driver;
		    }
            @Test(priority = 1)
			public void loginqountweb() throws InterruptedException {
				driver.manage().window().maximize();
				driver.get("https://test.qount.io");
				Thread.sleep(2000);
				driver.findElement(username).sendKeys("udayandeviant@gmail.com");
				driver.findElement(password).sendKeys("Qount-uday18");
				driver.findElement(submit).click();
				Thread.sleep(6000);
			}
            @Test(priority = 2)
			public void esignpage() throws InterruptedException {
				driver.findElement(esignatures).click();
				Thread.sleep(6000);
			}
            @Test(priority = 3)
			public void createicon() throws InterruptedException {
			driver.findElement(createsignicon).click();
            Thread.sleep(4000);	
            }
            @Test(priority = 4)
			public void signers() throws InterruptedException {
			driver.findElement(By.xpath("//input[contains(@placeholder, 'Enter Title')]")).sendKeys("Automatorsign782");
			Thread.sleep(3000);
			//Actions actions = new Actions(driver);    [contains(@placeholder, 'Enter Title')]
			//actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Servlet android development").build().perform();
			driver.findElement(By.xpath("//input[@placeholder='Select Client*']")).sendKeys("Mighty enterprises pvt ");
			driver.findElement(By.xpath("//input[@placeholder='Select Client*']")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("//input[@placeholder='Select Client*']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(labeldrop).click();
			driver.findElement(labelselect).click();
			Thread.sleep(2000);
	//		driver.findElement(branddrop).click();
	//		driver.findElement(brandselect).click();
	//		Thread.sleep(2000);
			driver.findElement(deletesigner).click();
			JavascriptExecutor kbajs = (JavascriptExecutor) driver;
//			kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-3-button').click()");
			kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-5-button').click()");
			kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-7-button').click()");
			kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-9-button').click()");
			kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-11-button').click()");
			kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-8-button').click()");
			kbajs.executeScript("document.getElementById('mat-mdc-slide-toggle-10-button').click()");
			Thread.sleep(3000);
			String docpath = System.getProperty("user.dir");
			driver.findElement(uploaddoc).sendKeys(docpath+ "\\uploadpdf\\donation gift card.pdf");		
			//Actions actions = new Actions(driver);
			//actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(5000);
            }
            @Test(priority = 5)
			public void reminder() throws InterruptedException {
			driver.findElement(reminderdrop).click();
			driver.findElement(reminderselect).click();
			Thread.sleep(3000);
			}
            @Test(priority = 6)
			public void addinvoice() throws InterruptedException {
			WebElement markcb = driver.findElement(addinvoice);
			markcb.click();
			WebElement markspl = driver.findElement(skipandpay);
			markspl.click();
			Thread.sleep(4000);
	//		driver.findElement(paylineitems).click();
	//		Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@placeholder='Select Item Code']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Select Item Code']")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("//input[@placeholder='Select Item Code']")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("//input[@placeholder='Select Item Code']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Amount']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Amount']")).sendKeys(Keys.BACK_SPACE);
			driver.findElement(By.xpath("//input[@placeholder='Amount']")).sendKeys(Keys.NUMPAD5);
			driver.findElement(By.xpath("//input[@placeholder='Amount']")).sendKeys(Keys.NUMPAD0);
			driver.findElement(next).click();
			Thread.sleep(2000);
            }
            @Test(priority = 7)
			public void predoctemp() throws InterruptedException {
			driver.findElement(notestemplate).click();
			driver.findElement(notestempselect).click();
			Thread.sleep(2000);
			String doccatch = System.getProperty("user.dir");
			driver.findElement(uploadpredoc).sendKeys(doccatch+ "\\uploadpdf\\update.pdf");	
		    Thread.sleep(6000);
			}
			@Test(priority = 8)
			public void emailtemp() throws InterruptedException {
			driver.findElement(emailtemplate).click();
			Thread.sleep(6000);
		    driver.findElement(markemailtemp).click();
//		    driver.findElement(By.xpath("//input[@id='mat-mdc-checkbox-74-input']")).click();
		    Thread.sleep(5000);
		    driver.findElement(selecttemp).click();
		    Thread.sleep(3000);
		    driver.findElement(submitform).click();
		    TimeUnit.SECONDS.sleep(20);
			}
			@Test(priority = 9)
			public void docusign() throws InterruptedException {
		   	WebElement framedoc = driver.findElement(iframe);
			driver.switchTo().frame(framedoc);
		    driver.findElement(nextframe).click();
		    Thread.sleep(3000);
		    WebElement from = driver.findElement(signfield); //signature
		    Actions actin = new Actions(driver);
		    actin.dragAndDropBy(from, 200, 70).perform();
		    Thread.sleep(2000);
		    driver.findElement(receipientdroplist).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@data-qa='recipient-2']")).click();
		    Thread.sleep(3000);
		    actin.dragAndDropBy(from, 280, 110).perform();
		    Thread.sleep(2000);
		    driver.findElement(receipientdroplist).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@data-qa='recipient-3']")).click();
		    Thread.sleep(3000);
		    actin.dragAndDropBy(from, 430, 140).perform();
		    Thread.sleep(2000);
		    driver.findElement(receipientdroplist).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@data-qa='recipient-4']")).click();
		    Thread.sleep(3000);
		    actin.dragAndDropBy(from, 350, 130).perform();
		    Thread.sleep(2000);
		    driver.findElement(receipientdroplist).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@data-qa='recipient-5']")).click();
		    Thread.sleep(3000);
		    actin.dragAndDropBy(from, 170, 130).perform();
		    Thread.sleep(2000);
		/*    driver.findElement(By.xpath("//button[@data-qa='recipient-selector']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@data-qa='recipient-6']")).click();
		    Thread.sleep(3000);
		    actin.dragAndDropBy(from, 140, 40).perform();   */
		    driver.findElement(clickdoc).click();
	//	    Thread.sleep(2000);
		    driver.findElement(nextframe).click();
		  //  Thread.sleep(2000);
		    driver.findElement(sendwofield).click();
		 }    
	} 