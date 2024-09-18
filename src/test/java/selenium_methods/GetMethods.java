package selenium_methods;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GetMethods 
{

	public static void main(String[] args) throws InterruptedException
	{
		// Get Methods
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // full screen maximize the browser
		// .get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// .getTitle()
		System.out.println(driver.getTitle());
		// .getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		// .getPageSource
		System.out.println(driver.getPageSource());
		// .getWindowHandle
		Thread.sleep(4000);
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		// .getWindowHandles
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);
	}

}
