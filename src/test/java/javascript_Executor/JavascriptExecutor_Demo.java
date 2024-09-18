package javascript_Executor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutor_Demo 
{
	public static void main(String[] args)
	{
		
		//ChromeDriver driver = new ChromeDriver();
		//JavascriptExecutor js1 = driver; // no type casting
		WebDriver driver = new ChromeDriver(); // up casting
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement ip1 = driver.findElement(By.xpath("//input[@id='name']"));
		
		// It is used when "Element.Intercepted Exception" is occurs.
		JavascriptExecutor js1 = (JavascriptExecutor) driver; // type casting
		
		// Passing the text into inputbox - alternate of sendKeys()
		js1.executeScript("arguments[0].setAttribute('value','Rishabh')", ip1);
	
		// Clicking on element - alternate of click()
		WebElement rd = driver.findElement(By.xpath("//input[@id='male']"));
		js1.executeScript("arguments[0].click()",rd);
	
	}
}
