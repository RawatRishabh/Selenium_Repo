package frames;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.get("https://ui.vision/demo/webtest/frames/");
	     
	     // Frame 1
	     WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	     driver.switchTo().frame(frame1);
	     driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("I am frame1");
	     driver.switchTo().defaultContent();
	     
	     // Frame 2
	     WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	     driver.switchTo().frame(frame2);
	     driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("I am frame2");
	     driver.switchTo().defaultContent();
	     
	     // Frame3
	     WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	     driver.switchTo().frame(frame3);
	     driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("I am frame3"); 
	     driver.switchTo().frame(0);
	     driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();
	     driver.switchTo().defaultContent();
	     
	     // Frame4
	     WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
	     driver.switchTo().frame(frame4);
	     driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("I am frame4"); 
	     driver.switchTo().defaultContent();
	    
	     // Frame5
	     WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
	     driver.switchTo().frame(frame5);
	     driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("I am frame5"); 
	     driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();	   
	     Thread.sleep(4000);
	     WebElement wimage = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']"));
	     System.out.println(wimage.isDisplayed());
	     driver.switchTo().defaultContent();
	     
	
	}

}
