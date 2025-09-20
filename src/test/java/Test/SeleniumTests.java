package Test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.*;
import org.apache.commons.io.FileUtils;


public class SeleniumTests {
	public static WebDriver driver;
	static ExtentReports report;
	public static ExtentTest test;
	static ExtentReports extent =new ExtentReports();
	@BeforeSuite
	public static void Setup() throws InterruptedException{
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
		driver.manage().window().maximize();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReports/Spark.html");
		extent.attachReporter(spark);
		HomePageTest.click_hamburger_menu();
		HomePageTest.click_onlineproduct_link();
	}
	public static String capture(WebDriver driver) throws IOException,IOException{		
		File scrFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dir =new File("target/ExtentReports/screenshots/");
		  if (!dir.exists()) {
	            dir.mkdirs();
	        }
		String filePath = "target/ExtentReports/screenshots/" + System.currentTimeMillis() + ".png";
        File dest = new File(filePath);
        FileUtils.copyFile(scrFile, dest);
        return dest.getAbsolutePath();
	}	
   @Test
   void validateTitle_OnlineProducts() throws IOException {
	   test=extent.createTest("Validate Shoe Title on Product Page","This test validates that the different Shoetypes are correct on Online Products");
	   ProductPageTest.formalShoes_verifyTitle();
	   ProductPageTest.sportsShoes_verifyTitle();
	   ProductPageTest.sneakers_verifyTitle();
	  // extent.flush();	   
   }   
   @Test
   void validateFirstFormalShoes() throws IOException {
	   test=extent.createTest("Validate First Formal Shoe","This test validates that the first formal shoe");
	   ProductPageTest.formalShoes_firstname_verify();
	  // extent.flush();	  
   }
   @Test
   void validateFirstSportsShoes() throws IOException {
	   test=extent.createTest("Validate First Sports Shoe","This test validates that the first sports shoe");
	   ProductPageTest.sportsShoes_firstname_verify();
	   //extent.flush();
}
  @Test
  void validateFirstSneakersShoes() throws IOException {
	  test=extent.createTest("Validate First Sneakers Shoe","This test validates that the first sneakers shoe");
	  ProductPageTest.SneakersShoes_firstname_verify();
	 // extent.flush();
  }
  public static void cleanup() {
	  extent.flush();
  }
  }