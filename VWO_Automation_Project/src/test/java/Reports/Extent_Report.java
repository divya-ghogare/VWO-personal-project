package Reports;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Base_Class.Base_Class;

public class Extent_Report extends Base_Class{
	public String projectpath = System.getProperty("user.dir");
	public Extent_Report() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@Test
public ExtentReports CreateExtentReport() {
		
		ExtentSparkReporter reports=new ExtentSparkReporter(projectpath+"\\Extent_Report\\VWO.html");
		reports.config().setDocumentTitle("VWO reports");
		reports.config().setReportName("functional testing");
		reports.config().setTheme(Theme.STANDARD);
		
		ExtentReports rep=new ExtentReports();
		rep.attachReporter(reports);
			
		rep.setSystemInfo("OS", "window");

		rep.setSystemInfo("QA", "divya ghogare");

		rep.setSystemInfo("browser", "chrome");
        return rep;
	
	}
}

