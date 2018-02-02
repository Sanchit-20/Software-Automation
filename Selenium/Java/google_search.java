package newpackage;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;

public class google_search {

   
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver", "geckodriver");
    	WebDriver driver= new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.google.co.in");
    	Scanner scan =new Scanner(System.in);
    	System.out.println("Enter your search here ");
    	String s=scan.nextLine();
    	WebElement w= driver.findElement(By.id("lst-ib"));
    	w.sendKeys(s);
    	w.sendKeys(Keys.RETURN);  // used to hit enter
    	System.out.println("Bye !!");
    	scan.close();
    	
    }
}
