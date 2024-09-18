package keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenlinkNewTab 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://webflow.com/made-in-webflow/demo");
		WebElement r1 = driver.findElement(By.xpath("//a[normalize-space()='Learn']"));
		Actions a1 = new Actions(driver);
		a1.keyDown(Keys.CONTROL).click(r1).keyUp(Keys.CONTROL).perform();
	
	}

}
