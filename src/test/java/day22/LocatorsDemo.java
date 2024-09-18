package day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo
{

	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver = new ChromeDriver(); // Launch Browser
		driver.get("https://demo-opencart.com/"); // Launch URL/Website
		driver.manage().window().maximize(); // Maximize current window
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac"); // find element return an element
		
		// id
//		if(driver.findElement(By.id("logo")).isDisplayed()) // isDislplayed(), return true or false
//		{
//			System.out.println("true");
//		}
//		else
//		{
//			System.out.println("false");
//		}
		
		// linktext(anchor tag a, href) and partialLink text
		// linktext
		//driver.findElement(By.linkText("Tablets")).click();
		//Thread.sleep(4000);
		// partialLink text
		//driver.findElement(By.partialLinkText("Phon")).click();
		
		// Classname
		//List<WebElement> l1 = driver.findElements(By.className("list-inline-item"));
		//System.out.println(l1.size());
		
		//Tagname
		//List<WebElement> l2 = driver.findElements(By.tagName("a"));
		//System.out.println(l2.size());
		
		//List<WebElement> l3 = driver.findElements(By.tagName("img"));
		//System.out.println(l3.size());
		
		
		//driver.quit(); // close the browser
	}

}
