package TestPages;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Pages.LoginPage;
import Reports.Extent_Report;

public class Test_LoginPage extends Extent_Report{
	LoginPage Login;
	public ExtentReports rep;
	public ExtentTest test;
  public Test_LoginPage() throws IOException {
		super();
	}

@BeforeMethod
  public void OpenBrowser() throws IOException {
	initialbrowser();
	Login=new LoginPage();
	rep=new ExtentReports();
	test=rep.createTest("VerifyLogin");

  }

@AfterMethod
public void closeBrowser() throws InterruptedException {
	browserClose();
}

@Test
public void TestLogin() throws Throwable {
	Login.VerifyLogin();
	test=rep.createTest("VWO login");
	  test.log(Status.INFO, "entered automation testing");
}

/*
//with invalid credential:
@Test
public void TestInvalidLogin() throws InterruptedException {
	Login.VerifyInvalidLogin();
}
*/
}

