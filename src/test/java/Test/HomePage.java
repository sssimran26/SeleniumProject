package Test;

import static Test.SeleniumTests.driver;

import org.openqa.selenium.By;

public class HomePage {
   public static String hamburger_menu_xpath ="//*[@id=\"menuToggle\"]/input";

   public static String onlineproduct_link_xpath ="//*[@id=\"menu\"]/a[3]/li";
   public static void click_hamburger_menu() {
	 driver.findElement(By.xpath(hamburger_menu_xpath)).click();
   }
	public static void click_onlineproduct_link() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath(onlineproduct_link_xpath)).click();
			

	}

}
