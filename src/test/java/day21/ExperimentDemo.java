package day21;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExperimentDemo
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String f1 = driver.getWindowHandle();
		System.out.println(f1);
		driver.navigate().refresh();
		// Refresh Does not change the window id
		System.out.println(f1);
		driver.get("https://testautomationpractice.blogspot.com/");
		String s1= driver.getWindowHandle();
		// Single window have always same id for all links will open on that.
		System.out.println(f1+"\n"+s1);
		
		
		
	}

}
