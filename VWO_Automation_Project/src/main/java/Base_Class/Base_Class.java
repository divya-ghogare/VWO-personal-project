package Base_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_Class {
	public static WebDriver driver;
	public static Properties prop;
	FileInputStream fInput;
	
	public Base_Class() throws IOException {
		 prop=new Properties();
		fInput =new FileInputStream("../VWO_Automation_Project/src/main/java/Utility/config.properties");
		
		prop.load(fInput);
		
		
	}
	
	public void initialbrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("loginnUrl"));
	}
	
	public void browserClose() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

	public static void takescreen(String screenshotname) throws Throwable{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("../VWO_Automation_Project/Screenshots/"+screenshotname+".png");
		FileHandler.copy(src, target);
	}
	
	public int Random_Number() {
		Random rm=new Random();
		int Random_Number = rm.nextInt(432);
		return Random_Number;
}
}
