package Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base_Class.Base_Class;

public class BlockedAccPage extends Base_Class{

	public BlockedAccPage() throws IOException {
		super();
	}
	@FindBy(xpath = "(//a[@class='text-link text-link--dark Fz(12px)'])[1]")WebElement showLoggedAcc;
	@FindBy(xpath = "//button[@data-qa='luniwaqoni']")WebElement signAllSession;
	@FindBy(xpath = "(//button[@aria-label='Close'])[2]")WebElement crossBtn;
	@FindBy(xpath = "//button[text()=' Verify Account ']")WebElement VerifyAccBtn;
	@FindBy(xpath = "//button[@class='btn btn--link btn--primary']")WebElement resendMail;
	@FindBy(xpath = "//button[@class='btn btn--inverted btn--primary']")WebElement okBtn;

	
	public void VerifyblockAcc() throws Throwable {
		JavascriptExecutor jsscrpt=(JavascriptExecutor) driver;
		jsscrpt.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		showLoggedAcc.click();
		Thread.sleep(4000);
		signAllSession.click();
		takescreen("showing blocked accounts");
		Thread.sleep(4000);
		crossBtn.click();
		VerifyAccBtn.click();
		takescreen("verify account popup");
		resendMail.click();
		//okBtn.click();
	}
}

