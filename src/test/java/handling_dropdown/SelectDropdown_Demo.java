package handling_dropdown;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDropdown_Demo
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drop1 = driver.findElement(By.xpath(" //select[@id='country']"));
		drop1.click();
		Select s1 = new Select(drop1);
		
		// Select option from dropdown
		// Text
		//s1.selectByVisibleText("India");
		// Value attribute
		//selectByValue("uk");
		// Index, start from 0
		//s1.selectByIndex(4);
		
		// Count of option in dropdown
		List<WebElement> opt = s1.getOptions();
		System.out.println(opt.size());
		
		// Name of option in dropdown
		for(WebElement e1 : opt)
		{
			System.out.println(e1.getText());
		}
		
		
	}

}
