package WorkingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().window().maximize();

		WebElement jsPromptAlert = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		// click on JS Prompt button
		jsPromptAlert.click();

		// switch to alert
		Alert alert = driver.switchTo().alert();

		// get alert text
		System.out.println("Alert Text: " + alert.getText());

		// dismiss alert
		alert.dismiss();

		// open JS Prompt again
		jsPromptAlert.click();

		// switch to alert again
		alert = driver.switchTo().alert();

		// type text inside alert
		alert.sendKeys("Hellooooooooooooo");

		// accept alert
		alert.accept();

//		driver.quit();
	}

}
