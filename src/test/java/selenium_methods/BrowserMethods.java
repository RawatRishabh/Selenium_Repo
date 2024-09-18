package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{
	   ChromeDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	   Thread.sleep(5000);
	   //driver.close();
	   driver.quit();
	   
	}

}
