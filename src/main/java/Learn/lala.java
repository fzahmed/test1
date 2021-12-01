package Learn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lala {
	WebDriver driver;
	

	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/billing/?ng=admin/");
	}
	
	@Test
	public void testLogin() {
		By EMAIL_ADDRESS_FIELD = By.xpath("//input[@id='username']");
		By PASSWARD_FIELD = By.xpath("//input[@id='password']");
		By SIGNIN_BUTTON = By.xpath("//button[@name='login']");
		
		By DASHBORD_HEADER = By.xpath("//h2[contains(text(),'Dashboard')]");
		By BANK_CASH_FIELD = By.xpath("//span[contains(text(),'Bank & Cash')]");
		By NEW_ACCOUNT_FIELD = By.xpath("//a[contains(text(),'New Account')]");
		
		By NEW_ACCOUNT_HEADER = By.xpath("//h2[contains(text(),'Accounts')]");
		By ACCOUNT_TITLE_FIELD = By.xpath("//input[@id='account']");
		By DESCRIPTION_FIELD = By.xpath("//input[@id='description']");
		By INITIAL_BALANCE_FIELD = By.xpath("//input[@id='balance']");
		By ACCOUNT_NUMBER_FIELD = By.xpath("//input[@id='account_number']");
		By CONTACT_PERSON_FIELD = By.xpath("//input[@id='contact_person']");
		By PHONE_FIELD = By.xpath("//input[@id='contact_phone']");
		By SUBMIT_BUTTON = By.xpath("//button[@type='submit' and @class='btn btn-primary']");
		
		
		
		driver.findElement(EMAIL_ADDRESS_FIELD).sendKeys("demo@techfios.com ");
		driver.findElement(PASSWARD_FIELD).sendKeys("abc123");
		driver.findElement(SIGNIN_BUTTON).click();
		
		Assert.assertEquals(driver.findElement(DASHBORD_HEADER).getText(),"Dashboard");
		
		driver.findElement(BANK_CASH_FIELD).click();
		driver.findElement(NEW_ACCOUNT_FIELD).click();
		

		
		driver.findElement(ACCOUNT_TITLE_FIELD).sendKeys("Zayan Ahmed");
		driver.findElement(DESCRIPTION_FIELD).sendKeys("Saving");
		driver.findElement(INITIAL_BALANCE_FIELD).sendKeys("500.00");
		driver.findElement(ACCOUNT_NUMBER_FIELD).sendKeys("987654321");
		driver.findElement(CONTACT_PERSON_FIELD).sendKeys("Suha");
		driver.findElement(PHONE_FIELD).sendKeys("211-911-211");
		//driver.findElement(SUBMIT_BUTTON).click();
	}

	//@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}

