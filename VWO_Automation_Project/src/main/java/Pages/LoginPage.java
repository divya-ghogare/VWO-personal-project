package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Class.Base_Class;

public class LoginPage extends Base_Class{
	
  public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
  }
  
		@FindBy(id ="login-username") WebElement email;
		@FindBy(id = "login-password") WebElement password;
		@FindBy(id = "checkbox-remember") WebElement checkbox;
		@FindBy(id = "js-login-btn") WebElement signupBtn;
		
		@FindBy(xpath = "//a[text()=' Create Test ']") WebElement createtestBtn;
		@FindBy(id = "new-campaign-name") WebElement campaignnameBtn;
		@FindBy(xpath = "(//button[@type='submit'])[3]")WebElement createBtn;
		
//with valid credential
		
public void VerifyLogin() throws InterruptedException {
	email.sendKeys(prop.getProperty("username"));
	password.sendKeys(prop.getProperty("password"));
	//checkbox.click();
	signupBtn.click();
	Thread.sleep(6000);
}
/*
//with invalid credential:
public void VerifyInvalidLogin() throws InterruptedException {
	email.sendKeys(prop.getProperty("invalidusername"));
	password.sendKeys(prop.getProperty("invalidpassword"));
	//checkbox.click();
	signupBtn.click();
	Thread.sleep(6000);
}
*/

}
