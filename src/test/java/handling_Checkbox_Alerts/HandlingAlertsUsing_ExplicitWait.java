package handling_Checkbox_Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertsUsing_ExplicitWait
{

	public static void main(String[] args) throws InterruptedException
	{
		// Handling alert using Explicit Wait
		   WebDriver driver = new ChromeDriver();
		   WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		   driver.manage().window().maximize();
		   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		   driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		   Alert a1 = w1.until(ExpectedConditions.alertIsPresent());
		   System.out.println(a1.getText());
		   Thread.sleep(4000);
		   a1.accept();
	}

}
