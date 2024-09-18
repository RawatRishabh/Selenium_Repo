package javascript_Executor;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollingPageDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		// 1) Scroll down page by pixel number
	    // js1.executeScript("window.scrollBy(0,1500)","");
	    // System.out.println(js1.executeScript("return window.pageYOffset;"));
	    
	    // 2) Scroll the page till element is visible
	    // WebElement to = driver.findElement(By.xpath("//h2[normalize-space()='Culture']"));
	    // js1.executeScript("arguments[0].scrollIntoView();",to);
	    // System.out.println(js1.executeScript("return window.pageYOffset;"));
	    
	    // 3) Scroll page till end of the page
	    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    Thread.sleep(4000);
	    
	   // 4) Scroll page till up of the page from down
	    js1.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
