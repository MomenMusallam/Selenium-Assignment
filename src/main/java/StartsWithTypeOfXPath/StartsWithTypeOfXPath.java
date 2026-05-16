package StartsWithTypeOfXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StartsWithTypeOfXPath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");

		driver.findElement(By.xpath("//button[starts-with(@id,'load-chec') and text()='Load Checkbox']"));

		driver.findElement(By.xpath("//input[starts-with(@name,'Count')]"));
		
		driver.findElement(By.xpath("//input[starts-with(@value,'Butt')]"));
	}
}
