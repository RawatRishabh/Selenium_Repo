package handling_Checkbox_Alerts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandlingAlertsDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	   
	   // 1) Normal alert with OK button
	   // driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	   // driver.switchTo().alert().accept();
	   
	   // 2) Confirmation Alert - Ok and Cancel button
	   // driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	  //  Alert a1 = driver.switchTo().alert();  
	 //   System.out.println(a1.getText());
	   // a1.accept();
	   // a1.dismiss();
	   
	   // 3) Prompt alert - Ok, Input and Exit
	  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	   Alert a2 = driver.switchTo().alert();
	   a2.sendKeys("Drishti"); // input not showing on prompt alert
	   Thread.sleep(4000);
	   a2.accept();
	   
	}

}
