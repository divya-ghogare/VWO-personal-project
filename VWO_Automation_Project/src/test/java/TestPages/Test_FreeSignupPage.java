package TestPages;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_Class.Base_Class;
import Pages.FreeSignupPage;

public class Test_FreeSignupPage extends Base_Class{
	FreeSignupPage FreeSignup;
	 
  public Test_FreeSignupPage() throws IOException {
		super();
	}
  @BeforeMethod
  public void openbrowser() throws IOException {
	  initialbrowser();
	  FreeSignup=new FreeSignupPage();
	  
  }

@Test
  public void TestFreeSignupPage() throws Throwable {
	
	FreeSignup.VerifyfreeSignupPage();
	
  }

@AfterMethod
public void closeBrowser() throws InterruptedException {
	browserClose();
}
}

