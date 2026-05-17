package verifyingWhetherButtonIsEnabledOrDisabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class verifyingWhetherButtonIsEnabledOrDisabled {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));

        driver.findElement(By.xpath("//button[text()='Enable'  and @onclick='swapInput()']")).click();

        // wait for 5 seconds
        Thread.sleep(5000);

        // verify enabled
        System.out.println("Text Field Enabled: " + textField.isEnabled());

        // click Disable button
        driver.findElement(By.xpath("//button[text()='Disable' and @onclick='swapInput()']")).click();

        //  wait for 5 seconds
        Thread.sleep(5000);

        // verify disabled
        System.out.println("Text Field Enabled After Disable: " + textField.isEnabled());
        
        driver.quit();
    }

}
