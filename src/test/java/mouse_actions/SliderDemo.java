package mouse_actions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SliderDemo 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement min = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
	    WebElement max = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
	    Actions a1 = new Actions(driver);
	    
	    // Min Slider Move
	    System.out.println("Before: "+min.getLocation()); // (59,250) {depends on screen resolution}
	    a1.dragAndDropBy(min, 100, 0).perform();
	    System.out.println("After: "+min.getLocation());
	    
	    // Max Slider Move
	    System.out.println("Before: "+max.getLocation()); // (59,250) {depends on screen resolution}
	    a1.dragAndDropBy(max, -100, 0).perform();
	    System.out.println("After: "+max.getLocation());
	    
	    // In adding and reducing, +5/-5 in value is okay.

	}

}
