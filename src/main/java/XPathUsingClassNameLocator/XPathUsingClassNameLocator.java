package XPathUsingClassNameLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathUsingClassNameLocator {
	
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElements(By.xpath("//input[@class='input_error form_input']"))
              .get(0)
              .sendKeys("standard_user");

        driver.findElements(By.xpath("//input[@class='input_error form_input']"))
              .get(1)
              .sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@class='submit-button btn_action']"))
              .click();
    }

}
