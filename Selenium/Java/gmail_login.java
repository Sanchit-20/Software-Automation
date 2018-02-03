package newpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail_login {

   
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","geckodriver");
        WebDriver driver = new FirefoxDriver(); // Launches Firefox Browser with blank url
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.google.com/");
        driver.findElement(By.id("identifierId")).sendKeys("email");
        driver.findElement(By.id("identifierNext")).click();
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys("password");
        driver.findElement(By.id("passwordNext")).click();
        WebElement l = driver.findElement(By.cssSelector(".gb_ab.gbii"));
        l.click();
        try{Thread.sleep(2000);}
        catch(Exception e) {}
        l = driver.findElement(By.id("gb_71"));
        l.click();
    }
}
