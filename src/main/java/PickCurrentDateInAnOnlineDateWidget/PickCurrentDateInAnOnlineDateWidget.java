package PickCurrentDateInAnOnlineDateWidget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickCurrentDateInAnOnlineDateWidget {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");

        driver.manage().window().maximize();

        // switch to iframe
        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);

        
        WebElement datepicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
     // click date picker input
        datepicker.click();
        // pick current date
        driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and @data-date='28']")).click();

        // print selected date
        String selectedDate = datepicker.getAttribute("value");
        System.out.println("Selected Date: " + selectedDate);

        driver.quit();
    }

}
