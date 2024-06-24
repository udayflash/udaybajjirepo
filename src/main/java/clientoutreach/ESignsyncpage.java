package clientoutreach;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.FluentWait;

		public class ESignsyncpage {
			WebDriver driver;
	//		NgWebDriver ngWebDriver;
			JavascriptExecutor jsDriver;
	//		protected FluentWait<WebDriver> wait;
					
		//	private By logintestpage = ("https://test.qount.io");
			private By username = By.cssSelector("input[placeholder='Username']");
			private By password = By.id("input__password");
			private By submit   = By.xpath("//button[@type='submit']");
			
			public ESignsyncpage(WebDriver driver) {
			this.driver = driver;
	//		this.wait = wait;
			jsDriver = (JavascriptExecutor) driver;
	//		ngWebDriver = new NgWebDriver(jsDriver);
			}
			public void loginqount() {
			driver.get("https://test.qount.io");
			driver.manage().window().maximize();
			driver.findElement(username).sendKeys("udayandeviant@gmail.com");
			driver.findElement(password).sendKeys("Qount-uday18");
			driver.findElement(submit).click();
			}
			}		
	/*		public void LoginQtio() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("https://test.qount.io");
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
			driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	/*		Thread.sleep(5000);
			driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(15) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
			Thread.sleep(4000);
			}
			public void Syncesign() throws InterruptedException {
			WebElement iscroll = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[2]"));
			JavascriptExecutor Jscr = (JavascriptExecutor) driver;
			Jscr.executeScript("arguments[0].scrollIntoView(true);" ,iscroll);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[10]")).click();
			//driver.findElement(By.xpath("//div[@class='g-table']//mat-icon[@role='img'][normalize-space()='more_vert'][normalize-space()='Prosignbug']")).click();
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='mdc-list-item__primary-text']//span[normalize-space()='Sync']")).click();
			}
			public void quitio() {
			driver.quit();
			}  */
		/*public class LoginPage {

		WebDriver driver;
		NgWebDriver ngWebDriver;
		JavascriptExecutor jsDriver;
		protected FluentWait<WebDriver> wait;
		
		private By userEmail = By.xpath("//input[@placeholder='Username']");
		private By userPwd = By.xpath("//input[@placeholder='Password']");
		private By loginButton = By.xpath("//button[@type='submit']");
		private By errorMessage = By.xpath("//div[@class='error mb-20']");
		private By userProfile = By.cssSelector("mat-mdc-menu-trigger logout-profile-badge");
		private By logout = By.xpath("//i[@class='icon ion-log-out power-symbol pe-3']");

		public LoginPage(WebDriver driver, FluentWait<WebDriver> wait) {
			this.driver = driver;
			this.wait = wait;
			jsDriver = (JavascriptExecutor) driver;
			ngWebDriver = new NgWebDriver(jsDriver);
		}
		public void login(String userName, String password) {
			driver.findElement(userEmail).clear();
			driver.findElement(userEmail).sendKeys(userName);
			driver.findElement(userPwd).clear();
			driver.findElement(userPwd).sendKeys(password);
			driver.findElement(loginButton).click();	
		}
		public void logout() {
			driver.findElement(userProfile).click();
			driver.findElement(logout).click();
		}
		public void loginWithValidCredentials(String userName, String password) {
			login(userName, password);
			ngWebDriver.waitForAngularRequestsToFinish();
			javaScriptClick(By.xpath("//div[@role='tab' and @aria-controls='mat-tab-content-0-4']"));
		}
		public String verifyErrorMessage() {
			return driver.findElement(errorMessage).getText();
		}
		public Boolean verifyHomePage() {
			return driver.getTitle().equals("Wallq");
		}
		public void javaScriptClick(By by) {
			WebElement element = driver.findElement(by);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		}
	}
		*/