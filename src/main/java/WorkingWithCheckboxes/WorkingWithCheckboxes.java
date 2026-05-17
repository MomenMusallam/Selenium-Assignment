package WorkingWithCheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCheckboxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		driver.manage().window().maximize();

		// get all checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		// check all checkboxes using for loop
		for (WebElement checkbox : checkboxes) {
			checkbox.click();

			// verify checkbox is selected
			System.out.println(checkbox.getAttribute("value") + " Selected: " + checkbox.isSelected());
		}

		// uncheck all checkboxes using for loop
		for (WebElement checkbox : checkboxes) {

			checkbox.click();

			// verify checkbox is unchecked
			System.out.println(checkbox.getAttribute("value") + " Selected After Uncheck: " + checkbox.isSelected());
		}

		driver.quit();
	}
}
