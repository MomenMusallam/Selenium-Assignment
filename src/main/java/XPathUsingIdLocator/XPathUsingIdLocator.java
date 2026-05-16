package XPathUsingIdLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathUsingIdLocator {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // Enter UserName
        driver.findElement(By.xpath("//*[@id='user-name']"))
              .sendKeys("standard_user");

        // Enter Password
        driver.findElement(By.xpath("//*[@id='password']"))
              .sendKeys("secret_sauce");

        // Click login button
        driver.findElement(By.xpath("//input[@id='login-button']"))
              .click();
    }
}
