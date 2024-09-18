package handling_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Testing 
{

	public static void main(String[] args)
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new"); // setting for headless mode of execution
		
		ChromeDriver driver = new ChromeDriver(option); // Make headless
		driver.get("https://webflow.com/made-in-webflow/demo");
		if(driver.findElement(By.xpath("//span[contains(text(),'Showcase your site')]")).isDisplayed())
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
	}

}
