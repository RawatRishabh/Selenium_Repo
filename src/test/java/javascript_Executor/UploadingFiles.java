package javascript_Executor;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class UploadingFiles 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		// 1) Single File Upload - a.txt
	   /* driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\myproject\\b.txt");
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("a.txt"))
		{
			System.out.println("Uploaded!");
		}
		else
		{
			System.out.println("Not Uploaded!");
		}
	    */
		// 2) Multiple File Upload - a.txt and b.txt
	/*	String file 1 = "C:\\myproject\\a.txt";
	 * String file 2 = "C:\\myproject\\b.txt";
	 * driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int num = findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		// Validation 1 - Number of files
		if(num==2)
		{
			System.out.println("Uploaded!");
		}
		else
		{
			System.out.println("Not Uploaded!");
		}
		
		// Validation 2 - Files Name
		 * if(driver.findElements(By.xpath("//ul[@id='fileList']//li[1]").getText().equals("a.txt)
		 *    && driver.findElements(By.xpath("//ul[@id='fileList']//li[2]").getText().equals("b.txt)  )
		 * 
		 * {
		 * 	System.out.println("Uploaded!");
		 * }
		 * else
		 * {
		 * 	System.out.println("Not Uploaded!");
		 * }
		*/
	}

}
