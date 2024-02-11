package Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Class.Base_Class;

public class DashoboardPage extends Base_Class{

	public DashoboardPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=' Create Test ']") WebElement createtestBtn;
	@FindBy(xpath = "//button[@class='icon-button icon-button--light toast-close-btn']")WebElement popup;
	@FindBy(id = "new-campaign-name") WebElement campaignnameBtn;
	@FindBy(xpath = "//button[@vwo-async-click='vm.createCampaign()']")WebElement createBtn;
	
	public void VerifyDashboard() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300);");
		popup.click();
		createtestBtn.click();
		takescreen("dashboard page");
		campaignnameBtn.clear();
		campaignnameBtn.sendKeys(prop.getProperty("campaignName"));
		takescreen("create campaign name");
		createBtn.click();
		Thread.sleep(6000);
}
}

