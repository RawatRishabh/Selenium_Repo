package handling_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_Handling 
{

	public static void main(String[] args)
	{
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true); // Setting to accept the SSL certificates
		
		ChromeDriver driver = new ChromeDriver(option); // Accept SSL certificates
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
