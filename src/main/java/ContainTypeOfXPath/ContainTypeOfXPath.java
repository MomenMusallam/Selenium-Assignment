package ContainTypeOfXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ContainTypeOfXPath {
	
	   public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://only-testing-blog.blogspot.com/");

	        driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
	        
	        driver.findElement(By.xpath("//button[contains(@id,'clickBtn') and contains(text(),'Click Me')]"));
	        
	        driver.findElement(By.xpath("//label[contains(text(),'Name:') and contains(@for,'name')]"));
	        
	        driver.findElement(By.xpath("//img[contains(@alt,'Test Image Alt Text')]"));

	   }
}
