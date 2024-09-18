package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Demo 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement e1 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions a1 = new Actions(driver);
		// Right Click Action
		a1.contextClick(e1).perform();
		driver.findElement(By.xpath("//span[normalize-space()='Paste']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

}
