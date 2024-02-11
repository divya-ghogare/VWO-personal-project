package TestPages;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base_Class.Base_Class;
import Pages.BlockedAccPage;
import Pages.LoginPage;

public class Test_BlockAccPage extends Base_Class {
	LoginPage Login;
	BlockedAccPage BlockPage;
	ExtentReports rep;
	ExtentTest test;
  public Test_BlockAccPage() throws IOException {
		super();
  }
  
@Test
  public void VerifyBlockAccPage() throws Throwable {
	Login.VerifyLogin();
	//Thread.sleep(3000);
	BlockPage.VerifyblockAcc();
	test=rep.createTest("VWO blocked account info");
	test.log(Status.INFO, "entered automation testing");
	
	
  }
  @BeforeMethod
  public void openbrowser() throws IOException {
	  initialbrowser();
	  Login=new LoginPage();
	  BlockPage=new BlockedAccPage();
	  rep=new ExtentReports();
	  test=rep.createTest("VWO blocked account info");
	
  }

  //@AfterMethod
  public void closeBrowser() throws InterruptedException {
		browserClose();
  }

}

