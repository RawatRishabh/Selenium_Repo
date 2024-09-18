package selenium_methods;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandleBroswerWindowDemo
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> wid = driver.getWindowHandles(); // it should be declared at last
		//  Approach 1
			/*List<String> l1 = new ArrayList(wid);
			String pid = l1.get(0);
			String sid = l1.get(1);
			System.out.println(driver.getTitle());
			driver.switchTo().window(sid);
			System.out.println(driver.getTitle());*/
		// System.out.println(pid+"\n"+sid);
		
		// Approach 2
		/*for(String sid : wid)
		{
			String title = driver.switchTo().window(sid).getTitle();
			if(title.equals("OrangeHRM"))
			{
			   System.out.println("Parent");
			}
		}*/
		
	}

}
