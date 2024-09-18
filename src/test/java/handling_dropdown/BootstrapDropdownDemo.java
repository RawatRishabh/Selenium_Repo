package handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownDemo 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		//driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); //open dropdown option
		// 1) Select single option
		// driver.findElement(By.xpath("//input[@value='Java']")).click();
		// 2) Capture all the options and find out size
		List<WebElement> l1 = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(l1.size());
		// 3) Printing options from dropdown
		for(WebElement w1 : l1)
		{
			System.out.println(w1.getText());
		}
		
	}

}
