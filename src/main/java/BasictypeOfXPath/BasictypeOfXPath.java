package BasictypeOfXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BasictypeOfXPath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Alert Dialogs')]"));
        
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("05/14/2026");
        
        driver.findElement(By.xpath("//button[@id='make-visible' and contains(text(),'Make Checkbox Visible')]")).click();
        
        WebElement element =  driver.findElement(By.xpath("//div[@id='rightClickArea']"));
        
        Actions actions = new Actions(driver);

        // Perform Right Click
        actions.contextClick(element).perform();

    }
}
