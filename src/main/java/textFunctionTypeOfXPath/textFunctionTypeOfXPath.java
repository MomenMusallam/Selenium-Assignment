package textFunctionTypeOfXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class textFunctionTypeOfXPath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");

		driver.findElement(By.xpath("//h3[text()='Resizable']"));

		driver.findElement(By.xpath("//a[text()='Alert Dialogs']"));

		driver.findElement(By.xpath("//span[text()='Saturday, 10 May 2014']"));

		driver.findElement(By.xpath("//a[text()='Add']"));

	}

}
