package handling_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestIncognitoMode 
{

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		
		ChromeDriver driver = new ChromeDriver(option); // Run test case in Incognito mode
		driver.get("https://www.cloudflare.com/learning/ssl/what-is-ssl/");
		System.out.println(driver.getTitle());
	}

}
