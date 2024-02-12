package Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Class.Base_Class;

public class FreeSignupPage extends Base_Class{

	public FreeSignupPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Start a free trial']")WebElement freetrialBtn;
	@FindBy(css = "input#page-v1-step1-email")WebElement workMail;
	@FindBy(id = "page-360cu-gdpr-consent-checkbox")WebElement checkbox;
	@FindBy(xpath = "(//button[@data-qa='page-su-submit'])[1]")WebElement createFreeAccBtn;
	@FindBy(id = "page-v1-fname")WebElement name;
	@FindBy(id = "page-v1-lname")WebElement lastName;
	@FindBy(id = "page-v1-pnumber")WebElement pnNumber;
	@FindBy(id = "page-v1-pwd")WebElement passwrd;
	@FindBy(xpath = "//button[text()='create account']")WebElement createAccBtn;
	@FindBy(id = "account-setup-url")WebElement websiteName;
	@FindBy(xpath = "(//div[@data-qa='opesuxkore'])[1]")WebElement selectTraffic;
	@FindBy(xpath = "//div[@data-qa='fimacusopa']")WebElement selectIndustry;
	@FindBy(xpath = "//button[@class='btn btn--positive btn--inverted Fxs(0) H(40px) Px(20px)']")WebElement nextBtn;
	@FindBy(xpath = "//option-slot[text()='Not sure']")WebElement selectNotsure;
	@FindBy(xpath = "//option-slot[text()='Software / SaaS / Downloads']")WebElement selectSoftware;
	@FindBy(xpath = "(//label[@class='checkbox checkbox--small'])[1]")WebElement product;
	@FindBy(xpath = "//button[@data-qa='btn-next']")WebElement productnextBtn;
	@FindBy(xpath = "//button[@class='btn btn--inverted btn--primary Px(20px) Mt(40px)']")WebElement connectWebsiteBtn;

	public void VerifyfreeSignupPage() throws Throwable {
		freetrialBtn.click();
		Thread.sleep(3000);
		
		workMail.sendKeys("divya"+Random_Number()+ "@gmail.com");
		//checkbox.click();
		takescreen("free trial with valid email");
		createFreeAccBtn.click();
		Thread.sleep(6000);
		
		name.sendKeys(prop.getProperty("name"));
		lastName.sendKeys(prop.getProperty("lastname"));
		
		//with valid phNumber and Password credential:
		pnNumber.sendKeys(prop.getProperty("phnumber"));
		passwrd.sendKeys(prop.getProperty("passwrd"));
		takescreen("valid phNumber and Password credential");
		/*
		//with invalid phNumber and Password credential:
		pnNumber.sendKeys(prop.getProperty("InvalidPhNumber"));
		passwrd.sendKeys(prop.getProperty("Invalidpasswrd"));
		takescreen("invalid phNumber and Password credential");
		*/
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		createAccBtn.click();
		Thread.sleep(12000);
		
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300);");
		websiteName.sendKeys(prop.getProperty("websitename"));
		selectTraffic.click();
		selectNotsure.click();
		selectIndustry.click();
		selectSoftware.click();
		takescreen("website page with valid entered details");
		nextBtn.click();
		Thread.sleep(6000);
		/*
		//without website name:
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300);");
		//websiteName.sendKeys(prop.getProperty("websitename"));
		selectTraffic.click();
		selectNotsure.click();
		selectIndustry.click();
		selectSoftware.click();
		nextBtn.click();
		takescreen("website page without website name");
		Thread.sleep(6000);
		*/
		product.click();
		takescreen("added free product");
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		productnextBtn.click();
		Thread.sleep(15000);
		connectWebsiteBtn.click();
		takescreen("logged in with free account");
		Thread.sleep(2000);
	}	
}
