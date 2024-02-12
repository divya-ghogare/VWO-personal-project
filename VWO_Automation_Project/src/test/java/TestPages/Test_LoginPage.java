package TestPages;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_Class.Base_Class;
import Pages.LoginPage;

public class Test_LoginPage extends Base_Class{
	LoginPage Login;
	
  public Test_LoginPage() throws IOException {
		super();
	}

@BeforeMethod
  public void OpenBrowser() throws IOException {
	initialbrowser();
	Login=new LoginPage();
  }

@AfterMethod
public void closeBrowser() throws InterruptedException {
	browserClose();
}

@Test
public void TestLogin() throws Throwable {
	Login.VerifyLogin();
	
}

/*
//with invalid credential:
@Test
public void TestInvalidLogin() throws InterruptedException {
	Login.VerifyInvalidLogin();
}
*/
}

