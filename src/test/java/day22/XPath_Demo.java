package day22;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class XPath_Demo 
{

	public static void main(String[] args) 
	{
		// Customized Locator (X-Path)
		WebDriver driver = new ChromeDriver(); // Launch chrome
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		// Xpath Single pass attribute
		// driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("MacBook");
		
		// Xpath Multiple pass attribute (more checking)
		// driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("MacBook");
		
		// Xpath with 'and' 'or' operators
		// and (both should be there)
		// driver.findElement(By.xpath("//input[@placeholder='Search' and @name = 'search']")).sendKeys("iphone");
		// or (atleast one should be there)
		// driver.findElement(By.xpath("//input[@placeholder='Search' or @name = 'search']")).sendKeys("Mac");
		
		// Xpath with innertext - text() {no using attribute}
		// innertext uses, where in tag , contain no attribute
		// innertext may be linktext
		// driver.findElement(By.xpath("//a[text()='Desktops']")).click();
		// boolean show = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		// System.out.println(show);
	    // String data = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		// System.out.println(data);
		
		// Xpath with contains(@attribute,'value')
		// matching anywhere
		// //tagname[contains(@attribute,'value')]
		// driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("MacBook Air");
	
		// Xpath with starts-with(@attribute,'value')
		// matching with begining
		// driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("MacBook Air");
		
		// Handling Dynamic Attributes
		// //*[@id='start' or @id='stop']
		// //*[contains(@id,'st')]
		// //*[starts-with(@id,'st')]
		
		// example : name = xyz001, xyz002, xyz003, xyz004
		// //*[contains(@name,'00')]
		// //*[starts-with(@name, 'xyz')]
		
		
		//Chained Xpath
		// no inner text and no attributes (example like, img tag)
		// go to parent element, when no found attribute 
		// //tagname[@attribute='value']/../..
		
		// <div></div>
		// div[contains(text(),'')]
		
		
	}
 
}
