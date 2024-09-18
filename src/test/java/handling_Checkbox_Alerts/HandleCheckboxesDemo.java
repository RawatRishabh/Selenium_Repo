package handling_Checkbox_Alerts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleCheckboxesDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 1) Select(click on) specific one checkbox
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		
		// 2) Select all the checkboxes
		List<WebElement> e1 = driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		/*for(WebElement s1 : e1)
		{
			s1.click();
		}*/
		
		// 3) Select last 3 checkboxes
		// total no. of checkboxes - how many checkboxes want to select = start index
		// for example (7-3 = 4, start indexing)
		/*for(int i=4;i<e1.size();i++)
		{
			e1.get(i).click();
		}*/
		
		// 4) Select first 3 checkboxes
		/*for(int i=0;i<3;i++)
		{
			e1.get(i).click();
		}*/
		
		// 5) Unselect checkboxes if they are selected
		/*Thread.sleep(4000);
		for(WebElement s1 : e1)
		{
			if(s1.isSelected())
			{
				s1.click();
			}
		}*/
		
	
	}

}
