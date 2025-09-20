package Test;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import static Test.SeleniumTests.*;

import static Test.SeleniumTests.driver;

import java.io.IOException;
public class ProductPageTest {
	
	public static String formalShoes_xpath="/html/body/div[2]/center/h2";
	public static String sportsShoes_xpath="/html/body/div[3]/center/h2";
	public static String sneakersShoes_xpath="/html/body/div[4]/center/h2";
	public static String formalShoesdropdown_xpath="/html/body/div[2]/center/div";
	public static String sportsShoesdropdown_xpath="/html/body/div[3]/center/div";
	public static String SneakersShoesdropdown_xpath="/html/body/div[4]/center/div";
	public static String formalShoesfirstname_xpath="/html/body/div[2]/table/tbody/tr[1]/td[1]";
	public static String sportsShoesfirstname_xpath="/html/body/div[3]/table/tbody/tr[1]/td[1]";
	public static String sneakersShoesfirstname_xpath="/html/body/div[4]/table/tbody/tr[1]/td[1]";
    public static void formalShoes_verifyTitle() throws IOException {
    String expectedTitleFS="Formal Shoes";
    String actualTitleFS=driver.findElement(By.xpath(formalShoes_xpath)).getText();
    try {
    	 Assert.assertEquals(expectedTitleFS, actualTitleFS);
    	test.log(Status.PASS, "Formal Shoes Title Verified: " + actualTitleFS, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
    } catch (AssertionError e) {
        test.log(Status.FAIL, "Expected: " + expectedTitleFS + " but Found: " + actualTitleFS,
        		MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
        throw e; // rethrow to fail test
    }
}
    
    public static void sportsShoes_verifyTitle() throws IOException {
    	String expectedTitleSS="Sports Shoes";
        String actualTitleSS=driver.findElement(By.xpath(sportsShoes_xpath)).getText();
//        Assert.assertEquals(expectedTitleSS, actualTitleSS);
//        if(expectedTitleSS.equals(actualTitleSS)) {
//        	test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
//        }
//    }
    try {
   	 Assert.assertEquals(expectedTitleSS, actualTitleSS);
   	test.log(Status.PASS, "Sports Shoes Title Verified: " + actualTitleSS, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
   } catch (AssertionError e) {
       test.log(Status.FAIL, "Expected: " + expectedTitleSS + " but Found: " + actualTitleSS,
       		MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
       throw e; // rethrow to fail test
   }
}
    public static void sneakers_verifyTitle() throws IOException {
    String expectedTitleSN="Sneakers";
    String actualTitleSN=driver.findElement(By.xpath(sneakersShoes_xpath)).getText();
//    Assert.assertEquals(expectedTitleSN, actualTitleSN);
//    if(expectedTitleSN.equals(actualTitleSN)) {
//    	test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");	
//    }
//    }
    try {
      	 Assert.assertEquals(expectedTitleSN, actualTitleSN);
      	test.log(Status.PASS, "Sports Shoes Title Verified: " + actualTitleSN, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
      } catch (AssertionError e) {
          test.log(Status.FAIL, "Expected: " + expectedTitleSN + " but Found: " + actualTitleSN,
          		MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
          throw e; // rethrow to fail test
      }
   }
    
    public static void formalShoes_firstname_verify() throws IOException {
    	String expectedFirstFormalShoe="Classic Cheltenham";
    	driver.findElement(By.xpath(formalShoesdropdown_xpath)).click();
    	String actualFirstFormalShoe=driver.findElement(By.xpath(formalShoesfirstname_xpath)).getText();
//    	Assert.assertEquals(expectedFirstFormalShoe.trim(), actualFirstFormalShoe.trim());
//    	 if(expectedFirstFormalShoe.equals(actualFirstFormalShoe)) {
//    		 WebElement element = driver.findElement(By.xpath(formalShoes_xpath));
//    		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)");
//    		 test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");	
//    	    }
//    }
    try {
    	Assert.assertEquals(expectedFirstFormalShoe.trim(), actualFirstFormalShoe.trim());
      	test.log(Status.PASS, "First Formal Shoes: " + actualFirstFormalShoe, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
      } catch (AssertionError e) {
          test.log(Status.FAIL, "Expected: " + expectedFirstFormalShoe + " but Found: " + actualFirstFormalShoe,
          		MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
          throw e; // rethrow to fail test
      }
   }
    
    public static void sportsShoes_firstname_verify() throws IOException {
    	String expectedFirstSportsShoe="Ultimate";
    	driver.findElement(By.xpath(sportsShoesdropdown_xpath)).click();
    	String actualFirstSportsShoe=driver.findElement(By.xpath(sportsShoesfirstname_xpath)).getText();
//    	Assert.assertEquals(expectedFirstSportsShoe.trim(), actualFirstSportsShoe.trim());
//    	 if(expectedFirstSportsShoe.equals(actualFirstSportsShoe)) {
//    		 WebElement element = driver.findElement(By.xpath(sportsShoes_xpath));
//    		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)"); 	    	
//    	    	test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
//    	    }    	
//    }
    try {
    	Assert.assertEquals(expectedFirstSportsShoe.trim(), actualFirstSportsShoe.trim());
      	test.log(Status.PASS, "First Sports Shoes: " + actualFirstSportsShoe, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
      } catch (AssertionError e) {
          test.log(Status.FAIL, "Expected: " + expectedFirstSportsShoe + " but Found: " + actualFirstSportsShoe,
          		MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
          throw e; // rethrow to fail test
      }
   }
    
    public static void SneakersShoes_firstname_verify() throws IOException {
    	String expectedFirstSneakersShoe="Archivo";
    	driver.findElement(By.xpath(SneakersShoesdropdown_xpath)).click();
    	String actualFirstSneakersShoe=driver.findElement(By.xpath(sneakersShoesfirstname_xpath)).getText();
//    	Assert.assertEquals(expectedFirstSneakersShoe.trim(), actualFirstSneakersShoe.trim());
//    	 if(expectedFirstSneakersShoe.equals(actualFirstSneakersShoe)) {
//    		 WebElement element = driver.findElement(By.xpath(sneakersShoes_xpath));
//    		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)");
//    		  test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");	
//    	    }
//    }
    try {
    	Assert.assertEquals(expectedFirstSneakersShoe.trim(), actualFirstSneakersShoe.trim());
      	test.log(Status.PASS, "First Sports Shoes: " + actualFirstSneakersShoe, MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
      } catch (AssertionError e) {
          test.log(Status.FAIL, "Expected: " + expectedFirstSneakersShoe + " but Found: " + actualFirstSneakersShoe,
          		MediaEntityBuilder.createScreenCaptureFromPath(capture(driver)).build());
          throw e; // rethrow to fail test
      }
   }
}
