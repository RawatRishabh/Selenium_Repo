package day21;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase 
{
	/*
	 * Test Cases
	 * -----------
	 * 1) Launch browser (chrome)
	 * 2) Open URL https://www.saucedemo.com/v1/
	 * 3) Validate title should be "Swag Labs"
	 * 4) Close browser
	 * */

	public static void main(String[] args) throws InterruptedException 
	{
		//1 Launch browser (chrome)
		// ChromeDriver class has constructor which is invoke chrome browser, when you create an object.
		// ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver(); // Upcasting (parent class variable reference to child class object)
		WebDriver driver = new EdgeDriver();
		//2 Open URL https://www.saucedemo.com/v1/

		// get(string), open the url in launch browser
		driver.get("https://www.saucedemo.com/v1/");
		
		//3 Validate title should be "Swag Labs"
		// .getTitle() methods, return title of web page in string format
		String actual = driver.getTitle(); 
		if(actual.equals("Swag Labs"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}

		//4 Close browser
		//driver.close(); both are same (it give warning)
		Thread.sleep(4000);
		driver.quit();
	}
 
}
