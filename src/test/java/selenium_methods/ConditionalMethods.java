package selenium_methods;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConditionalMethods
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		// isDisplayed() {element is displayed or not}
		// WebElement img = driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
		// System.out.println(img.isDisplayed());
		
		// isEnabled() {operational element is disabled or enabled}
		// System.out.println(driver.findElement(By.xpath("//input[@id='name']")).isEnabled());
		
		// isSelected() {element is selected or not}
		// System.out.println(driver.findElement(By.xpath("//input[@id='male'a]")).isSelected());
		
	}

}
