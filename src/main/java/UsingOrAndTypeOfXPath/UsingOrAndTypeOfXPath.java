package UsingOrAndTypeOfXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingOrAndTypeOfXPath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");

		driver.findElement(By.xpath("//input[@id='check3' and @name='option3']"));

		driver.findElement(By.xpath(
				"//a[@href='https://only-testing-blog.blogspot.com/2025/04/alert-dialogs.html\' or text()='Alert Dialogs']"));
		
		driver.findElement(By.xpath("//input[@id='text1' and @name='Town']"));
	}
}
