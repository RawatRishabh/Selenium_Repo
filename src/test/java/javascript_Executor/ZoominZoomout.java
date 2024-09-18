package javascript_Executor;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ZoominZoomout 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://webflow.com/made-in-webflow/demo");
		// Maximize the browser
		driver.manage().window().maximize();
		// Thread.sleep(4000);
		// Minimize the browser
		// driver.manage().window().minimize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // Zoom the web page
        Thread.sleep(4000);
	    js.executeScript("document.body.style.zoom='50%'");
	}

}
