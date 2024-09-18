package mouse_actions;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverDemo 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement hv1 = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement hv2 = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		//Actions class
		Actions a1 = new Actions(driver);
		// Every action method statement should end with build(), perform() or perform()
		// build() --> create an action
		// perform() --> complete an action
		// perform() --> inbuilt has build()
		// we can apply multiple in single action (should have linktogether) --> .moveToElement(element)
		// build() --> mostly uses when we need to perform action later
		//a1.moveToElement(hv1).moveToElement(hv2).build().perform();
		a1.moveToElement(hv1).moveToElement(hv2).click().perform();
		
		
	}

}
