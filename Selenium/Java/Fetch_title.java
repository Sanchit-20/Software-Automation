package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myclass {

   
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","geckodriver");
        WebDriver driver = new FirefoxDriver(); // Launches Firefox Browser with blank url
        driver.get("https://www.google.com"); // Navigates to the specified URL
        String Title = driver.getTitle();
        System.out.println(Title);
        driver.close(); // Closes the Browser
    }
}
