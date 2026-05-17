package returnKeyAfterEnteringValueInTextField;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class returnKeyAfterEnteringValueInTextField {
	
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");

        WebElement textArea = driver.findElement(By.xpath("//textarea[@id='ta1']"));
        textArea.sendKeys("Hello test one two three");
        textArea.sendKeys(Keys.ENTER);
 
        driver.quit();
    }
    

}
