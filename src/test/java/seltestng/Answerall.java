package seltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Answerall {
    WebDriver driver;
    @Test
	public void allanswertype() throws InterruptedException{
		// TODO Auto-generated method stub
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://test.qount.io");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
	driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
//	driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(18) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
	Thread.sleep(4000);
	Actions actoned = new Actions(driver);
	WebElement orgrown = driver.findElement(By.xpath("(//td[normalize-space()='Art 74 Qs'])[1]"));
	actoned.moveToElement(orgrown).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//td[normalize-space()='Art 74 Qs'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[normalize-space()='In Progress']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Teraline Fidgets']")).click();
	Thread.sleep(3000);
/*	WebElement checkboxquestion = driver.findElement(By.xpath("(//div[normalize-space()='5.'])[1]"));
    actoned.moveToElement(checkboxquestion).perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='5'])[1]")).click();  
    Thread.sleep(2000);  //nps question
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='4'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='3'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='2'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='1'])[1]")).click();
    Thread.sleep(3000); */ 
/*    Thread.sleep(3000);//next section
    WebElement comment = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='chat_bubble_outline'])[7]"));
    actoned.moveToElement(comment).perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='chat_bubble_outline'])[6]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//label[contains(@id,'mat-mdc-form-field-label-')]")).click();
    Thread.sleep(2000);
    Actions actionsc = new Actions(driver);
	actionsc.sendKeys("Automate comment").build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Cancel']")).click();        */
//	Thread.sleep(2000);	
	WebElement checkquestion = driver.findElement(By.xpath("(//div[normalize-space()='4.'])[1]"));
    actoned.moveToElement(checkquestion).perform();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//label[contains(text(),'Klusener')]")).click();   //checkbox
    Thread.sleep(2000);
    driver.findElement(By.xpath("//label[contains(text(),'Kumble')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//label[contains(text(),'Klusener')]")).click();
    Thread.sleep(2000);
	WebElement starquestion = driver.findElement(By.xpath("(//div[normalize-space()='5.'])[1]"));
    actoned.moveToElement(starquestion).perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//i[@class='icon ion-ios-star-outline star ng-star-inserted'])[4]")).click();  //star rating
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//i[@class='icon ion-ios-star star selected ng-star-inserted'])[2]")).click();
    Thread.sleep(2000);
	WebElement npsquestion = driver.findElement(By.xpath("(//div[normalize-space()='6.'])[1]"));
    actoned.moveToElement(npsquestion).perform();
    Thread.sleep(3000);
    WebElement npsnumquestion = driver.findElement(By.xpath("(//div[normalize-space()='5.'])[1]"));
    actoned.moveToElement(npsnumquestion).perform();
    Thread.sleep(2000);
/*    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 star'][text()=' 3 '])[1]")).click();  
    Thread.sleep(2000);  
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 star'][text()=' 5 '])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 star'][text()=' 6 '])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 star'][text()=' 7 '])[1]")).click();
    Thread.sleep(2000);     */
    driver.findElement(By.xpath("(//div[@role='tab'][@aria-posinset='2'])")).click();
	Thread.sleep(3000);     
	WebElement radioquestion = driver.findElement(By.xpath("(//div[normalize-space()='4.'])[1]"));
    actoned.moveToElement(radioquestion).perform();
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[8]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[9]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[7]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[6]")).click();
	Thread.sleep(2000);
	WebElement radionequestion = driver.findElement(By.xpath("(//div[normalize-space()='7.'])[1]"));
    actoned.moveToElement(radionequestion).perform();
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[16]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[17]")).click();
	Thread.sleep(2000);
	WebElement radionumquestion = driver.findElement(By.xpath("(//div[normalize-space()='8.'])[1]"));
    actoned.moveToElement(radionumquestion).perform();
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[21]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[23]")).click();
	Thread.sleep(2000);
	WebElement comment = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='chat_bubble_outline'])[7]"));
    actoned.moveToElement(comment).perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='chat_bubble_outline'])[6]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//label[contains(@id,'mat-mdc-form-field-label-')]")).click();
    Thread.sleep(2000);
    Actions actionsc = new Actions(driver);
	actionsc.sendKeys("Automate comment").build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Cancel']")).click();        
	Thread.sleep(2000);	
	driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[1]")).click();
	Thread.sleep(3000);//prev section
	driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[3]")).click();
    Thread.sleep(3000);//next section
    driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[2]")).click();
    Thread.sleep(3000);//next section
	driver.findElement(By.xpath("//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base ng-star-inserted']")).click();
	Thread.sleep(3000); //prev section review
	driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[2]")).click();
    Thread.sleep(2000);
 //   driver.findElement(By.xpath("(//mat-icon[normalize-space()='lock_open'])[1]")).click();
//	Thread.sleep(3000);
 //   driver.findElement(By.xpath("(//mat-icon[normalize-space()='lock'])[1]")).click();
 //   Thread.sleep(2000);
 //   driver.findElement(By.xpath("(//mat-icon[normalize-space()='check_circle'])[1]")).click();
 //   Thread.sleep(2000);
 //   driver.findElement(By.xpath("(//mat-icon[normalize-space()='check_circle'])[1]")).click();
 //   Thread.sleep(2000);
    driver.findElement(By.xpath("(//mat-icon[normalize-space()='file_download'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()=' Organizer with Attachments ']")).click();
    }
}
