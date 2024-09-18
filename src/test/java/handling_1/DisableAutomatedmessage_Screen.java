package handling_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedmessage_Screen 
{

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"}); // Setting to Disable Automated Message on webscreen
		
		ChromeDriver driver = new ChromeDriver(option); // Disable Automated Message on webscreen
		driver.get("https://www.cloudflare.com/learning/ssl/what-is-ssl/");
		System.out.println(driver.getTitle());
	}

}
