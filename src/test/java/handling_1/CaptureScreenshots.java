package handling_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CaptureScreenshots
{

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cloudflare.com/learning/performance/speed-up-a-website/");
		
		// 1) Full page screenshot
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE); // returns type file save in unknown location
		File target = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		source.renameTo(target); // copy sourcefile to targetfile */
	
	    // 2) Specific area of the page
		/*WebElement cap1 = driver.findElement(By.xpath("(//div[@class='footer-top-section'])[1]"));
		File source = cap1.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\screenshots\\portion.png");
		source.renameTo(target); */
		
		// 3) Web element
		WebElement cap1 = driver.findElement(By.xpath("//img[@title='site speed']"));
		File source = cap1.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\screenshots\\element.png");
		source.renameTo(target);
		
	}

}
