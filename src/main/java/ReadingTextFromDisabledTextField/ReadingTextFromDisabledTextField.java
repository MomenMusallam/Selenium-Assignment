package ReadingTextFromDisabledTextField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadingTextFromDisabledTextField {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");

        WebElement button = driver.findElement(By.xpath("//button[@id='but1' and @disabled]"));
        String buttonText = button.getText();

        System.out.println("Button Text is: " + buttonText);
        
        driver.quit();
    }

}
