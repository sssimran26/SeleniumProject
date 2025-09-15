package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import static Test.SeleniumTests.*;

import static Test.SeleniumTests.driver;

import java.io.IOException;
public class ProductPageTest {
	
	public static String formalShoes_xpath="/html/body/div[2]/center/h2";
	public static String sportsShoes_xpath="/html/body/div[3]/center/h2";
	public static String sneakersShoes_xpath="/html/body/div[4]/center/h2";
	public static String formalShoesdropdown_xapth="/html/body/div[2]/center/div";
	public static String sportsShoesdropdown_xapth="/html/body/div[3]/center/div";
	public static String SneakersShoesdropdown_xapth="/html/body/div[4]/center/div";
	public static String formalShoesfirstname_xapth="/html/body/div[2]/table/tbody/tr[1]/td[1]";
	public static String sportsShoesfirstname_xapth="/html/body/div[3]/table/tbody/tr[1]/td[1]";
	public static String sneakersShoesfirstname_xapth="/html/body/div[4]/table/tbody/tr[1]/td[1]";
    public static void formalShoes_verifyTitle() throws IOException {
    String expectedTitleFS="Formal Shoes";
    String actualTitleFS=driver.findElement(By.xpath(formalShoes_xpath)).getText();
    Assert.assertEquals(expectedTitleFS, actualTitleFS);
    if(expectedTitleFS.equals(actualTitleFS)) {
    	test.log(Status.PASS,"Test Passed for title verification of formal shoes"); 
    	test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
    }
    //else if(false) 
    //{ test.log(Status.FAIL,"test fail");
   // }
    }
    public static void sportsShoes_verifyTitle() throws IOException {
    	String expectedTitleSS="Sports Shoes";
        String actualTitleSS=driver.findElement(By.xpath(sportsShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleSS, actualTitleSS);
        if(expectedTitleSS.equals(actualTitleSS)) {
        	test.log(Status.PASS,"Test Passed for title verification of formal shoes"); 
        	test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Failed");
        }
    }
    public static void sneakers_verifyTitle() {
    String expectedTitleSN="Sneakers";
    String actualTitleSN=driver.findElement(By.xpath(sneakersShoes_xpath)).getText();
    Assert.assertEquals(expectedTitleSN, actualTitleSN);
    if(expectedTitleSN.equals(actualTitleSN)) {
    	test.log(Status.PASS,"Test Passed for title verification of formal shoes"); 	
    }
    }
    public static void formalShoes_firstname_verify() {
    	String expectedFirstFormalShoe="Classic Cheltenham";
    	driver.findElement(By.xpath(formalShoesdropdown_xapth)).click();
    	String actualFirstFormalShoe=driver.findElement(By.xpath(formalShoesfirstname_xapth)).getText();
    	Assert.assertEquals(expectedFirstFormalShoe.trim(), actualFirstFormalShoe.trim());
    	 if(expectedFirstFormalShoe.equals(actualFirstFormalShoe)) {
    		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)");
    	    	test.log(Status.PASS,"Test Passed for title verification of formal shoes"); 	
    	    }

    }
    public static void sportsShoes_firstname_verify() {
    	String expectedFirstSportsShoe="Ultimate";
    	driver.findElement(By.xpath(sportsShoesdropdown_xapth)).click();
    	String actualFirstSportsShoe=driver.findElement(By.xpath(sportsShoesfirstname_xapth)).getText();
    	Assert.assertEquals(expectedFirstSportsShoe.trim(), actualFirstSportsShoe.trim());
    	 if(expectedFirstSportsShoe.equals(actualFirstSportsShoe)) {
    		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)");
    	    	test.log(Status.PASS,"Test Passed for title verification of formal shoes"); 	
    	    }
    	
    }
    public static void SneakersShoes_firstname_verify() {
    	String expectedFirstSneakersShoe="Archivo";
    	driver.findElement(By.xpath(SneakersShoesdropdown_xapth)).click();
    	String actualFirstSneakersShoe=driver.findElement(By.xpath(sneakersShoesfirstname_xapth)).getText();
    	Assert.assertEquals(expectedFirstSneakersShoe.trim(), actualFirstSneakersShoe.trim());
    	 if(expectedFirstSneakersShoe.equals(actualFirstSneakersShoe)) {
    		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)");
    	    	test.log(Status.PASS,"Test Passed for title verification of formal shoes"); 	
    	    }
    }
}
