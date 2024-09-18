package handling_Checkbox_Alerts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleAuthenticatedPopup 
{

	public static void main(String[] args)
	{
		// Handling authenticatedpop by using injection process
		// passing username and password in the URL.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		// example, username:password@
		// https://admin:admin@the-internet.herokuapp.com/basic_auth		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
