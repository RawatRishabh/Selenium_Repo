package selenium_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagationMethodsDemo 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		// navigate().to(url) --> url (string format or url obj format)
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://www.nopcommerce.com/en");
		// navigate().back()
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		// navigate().forward()
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		// navigate().refresh();
	    driver.navigate().refresh();
	}

}
