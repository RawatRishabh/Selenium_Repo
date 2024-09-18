package keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs_Windows
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://themeforest.net/search/demos?srsltid=AfmBOoqMfwJOgVTswHMy2f7oHH1moMPphelOJ9hUvgnFyK7JDOCpqbb0");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://oceanwp.org/demos/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://webflow.com/made-in-webflow/demo");

	}

}
