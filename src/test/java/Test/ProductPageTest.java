package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import static Test.SeleniumTests.*;

import static Test.SeleniumTests.driver;

import java.io.IOException;
import java.time.Duration;
public class ProductPageTest {
	
//	public static String formalShoes_xpath="/html/body/div[2]/center/h2";
//	public static String sportsShoes_xpath="/html/body/div[3]/center/h2";
//	public static String sneakersShoes_xpath="/html/body/div[4]/center/h2";
	public static String formalShoes_xpath = "//h2[contains(text(),'Formal Shoes')]";
	public static String sportsShoes_xpath = "//h2[contains(text(),'Sports Shoes')]";
	public static String sneakersShoes_xpath = "//h2[contains(text(),'Sneakers')]";

	public static String formalShoesdropdown_xpath="/html/body/div[2]/center/div";
	public static String sportsShoesdropdown_xpath="/html/body/div[3]/center/div";
	public static String sneakersShoesdropdown_xpath="/html/body/div[4]/center/div";
	public static String formalShoesfirstname_xpath="/html/body/div[2]/table/tbody/tr[1]/td[1]";
	public static String sportsShoesfirstname_xpath="/html/body/div[3]/table/tbody/tr[1]/td[1]";
	public static String sneakersShoesfirstname_xpath="/html/body/div[4]/table/tbody/tr[1]/td[1]";
    public static void formalShoes_verifyTitle() throws IOException {
    String expectedTitleFS="Formal Shoes";
    String actualTitleFS=driver.findElement(By.xpath(formalShoes_xpath)).getText();
    try {
    	 Assert.assertEquals(expectedTitleFS, actualTitleFS);
    	test.log(Status.PASS, "Formal Shoes Title Verified: " + actualTitleFS, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "FormalShoesTitle")).build());
    } catch (AssertionError e) {
    	

        test.log(Status.FAIL, "Expected: " + expectedTitleFS + " but Found: " + actualTitleFS,
        		MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "FormalShoesTitle")).build());

        throw e; // rethrow to fail test
    }
}
    
    public static void sportsShoes_verifyTitle() throws IOException {
    	String expectedTitleSS="Sports Shoes";
        String actualTitleSS=driver.findElement(By.xpath(sportsShoes_xpath)).getText();
    try {
   	 Assert.assertEquals(expectedTitleSS, actualTitleSS);
   	test.log(Status.PASS, "Sports Shoes Title Verified: " + actualTitleSS, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "SportsShoesTitle")).build());

   } catch (AssertionError e) {
	   

       test.log(Status.FAIL, "Expected: " + expectedTitleSS + " but Found: " + actualTitleSS,
    		   MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "SportsShoesTitle")).build());
       throw e; // rethrow to fail test
   }
}
    public static void sneakers_verifyTitle() throws IOException {
    String expectedTitleSN="Sneakers";
    String actualTitleSN=driver.findElement(By.xpath(sneakersShoes_xpath)).getText();
    try {
      	 Assert.assertEquals(expectedTitleSN, actualTitleSN);
      	test.log(Status.PASS, "Sneakers Shoes Title Verified: " + actualTitleSN, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "SneakerShoesTitle")).build());
      } catch (AssertionError e) {
    	  

          test.log(Status.FAIL, "Expected: " + expectedTitleSN + " but Found: " + actualTitleSN,
        		  MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "SneakersShoesTitle")).build());
          throw e; // rethrow to fail test
      }
   }
    
    public static void formalShoes_firstname_verify() throws IOException, InterruptedException {
    	String expectedFirstFormalShoe="Classic Cheltenham";
    	driver.findElement(By.xpath(formalShoesdropdown_xpath)).click();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formalShoesfirstname_xpath)));

    	    WebElement element = driver.findElement(By.xpath(formalShoesfirstname_xpath));
    	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    	    Thread.sleep(500);

    	String actualFirstFormalShoe=driver.findElement(By.xpath(formalShoesfirstname_xpath)).getText();
    try {
    	Assert.assertEquals(expectedFirstFormalShoe.trim(), actualFirstFormalShoe.trim());
      	test.log(Status.PASS, "First Formal Shoes: " + actualFirstFormalShoe, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "FormalShoesFirstName")).build());
      } catch (AssertionError e) {
          test.log(Status.FAIL, "Expected: " + expectedFirstFormalShoe + " but Found: " + actualFirstFormalShoe,
        		  MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "FormalShoesFirstName")).build());
          throw e; // rethrow to fail test
      }
   }
    
    public static void sportsShoes_firstname_verify() throws IOException, InterruptedException {
    	String expectedFirstSportsShoe="Ultimate";
    	driver.findElement(By.xpath(sportsShoesdropdown_xpath)).click();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sportsShoesfirstname_xpath)));
    	WebElement element = driver.findElement(By.xpath(sportsShoes_xpath));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    	String actualFirstSportsShoe=driver.findElement(By.xpath(sportsShoesfirstname_xpath)).getText();
    try {
    	Assert.assertEquals(expectedFirstSportsShoe.trim(), actualFirstSportsShoe.trim());
      	test.log(Status.PASS, "First Sports Shoes: " + actualFirstSportsShoe, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "SportsShoesFirstName")).build());
      } catch (AssertionError e) {
          test.log(Status.FAIL, "Expected: " + expectedFirstSportsShoe + " but Found: " + actualFirstSportsShoe,
        		  MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "SportsShoesFirstName")).build());
          throw e; // rethrow to fail test
      }
   }
    
    public static void sneakersShoes_firstname_verify() throws IOException, InterruptedException {
    	String expectedFirstSneakersShoe="Archivo";
    	driver.findElement(By.xpath(sneakersShoesdropdown_xpath)).click();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sneakersShoesfirstname_xpath)));
    	WebElement element = driver.findElement(By.xpath(sneakersShoes_xpath));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    	String actualFirstSneakersShoe=driver.findElement(By.xpath(sneakersShoesfirstname_xpath)).getText();
    try {
    	Assert.assertEquals(expectedFirstSneakersShoe.trim(), actualFirstSneakersShoe.trim());
      	test.log(Status.PASS, "First Sneakers Shoes: " + actualFirstSneakersShoe, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "SneakerShoesFirstName")).build());
      } catch (AssertionError e) {
          test.log(Status.FAIL, "Expected: " + expectedFirstSneakersShoe + " but Found: " + actualFirstSneakersShoe,
        		  MediaEntityBuilder.createScreenCaptureFromPath(capture(driver, "SneakerShoesFirstName")).build());
          throw e; // rethrow to fail test
      }
   }
}
