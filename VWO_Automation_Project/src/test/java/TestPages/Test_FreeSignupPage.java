package TestPages;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base_Class.Base_Class;
import Pages.FreeSignupPage;

public class Test_FreeSignupPage extends Base_Class{
	FreeSignupPage FreeSignup;
	public ExtentReports rep;
	public ExtentTest test;
	
  public Test_FreeSignupPage() throws IOException {
		super();
	}
  @BeforeMethod
  public void openbrowser() throws IOException {
	  initialbrowser();
	  FreeSignup=new FreeSignupPage();
	  rep=new ExtentReports();
		test=rep.createTest("Freesignin acc created");
	  
  }

@Test
  public void TestFreeSignupPage() throws Throwable {
	FreeSignup.VerifyfreeSignupPage();
	test=rep.createTest("VWO free signup");
	  test.log(Status.INFO, "entered automation testing");
	  
  }
}

