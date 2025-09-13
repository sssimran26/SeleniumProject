package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstclass {
  @Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        // Go to Google
        driver.get("https://www.google.com");

        // Print Title
        System.out.println("Page Title is: " + driver.getTitle());

        // Close browser
        driver.quit();
	}

}
//	 @Test
//	    public void openGoogle() {
//	        WebDriver driver = new ChromeDriver();
//	        driver.get("https://www.google.com");
//	        driver.quit();
//	    }
//	}
