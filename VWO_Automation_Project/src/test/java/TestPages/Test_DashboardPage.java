package TestPages;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_Class.Base_Class;
import Pages.DashoboardPage;
import Pages.LoginPage;

public class Test_DashboardPage extends Base_Class{
	LoginPage Login;
	DashoboardPage Dashoboard;
	
  public Test_DashboardPage() throws IOException {
		super();
	}
  
  @BeforeMethod
  public void OpenBrowser() throws IOException {
	initialbrowser();
	Login=new LoginPage();
	Dashoboard=new DashoboardPage();
	
  }

@AfterMethod
public void closeBrowser() throws InterruptedException {
	browserClose();
}

@Test
  public void TestDashboard() throws Throwable {
	Login.VerifyLogin();
	Dashoboard.VerifyDashboard();
	
  }
}

