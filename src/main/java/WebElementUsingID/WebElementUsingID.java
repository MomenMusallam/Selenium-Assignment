package WebElementUsingID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementUsingID {

    public static void main(String[] args) {

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // Open Coursera login page
        driver.get("https://www.coursera.org/?authMode=login");

        // Find web element using ID
//        The email input field has a dynamic ID, which means the ID may change when the page is refreshed or reopened.
//        driver.findElement(By.id("cds-react-aria1874373670-:r1s:"));
        
        driver.findElement(By.name("email"));
        System.out.println("Element found successfully using Name");

        // Close the browser
        driver.quit();
    }
}
