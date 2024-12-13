package capturescreenshotsdemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotDemo {
	
	public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");  
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	
	//usingtakeScreenshot interface
	//TakesScreenshot ts=(TakesScreenshot)driver;   
	
	/*here driver is the parent class object and i m assigning it to child class
	 ref variable. so we have to to upcasting*/
	
//	File sourcefile=ts.getScreenshotAs(OutputType.FILE); //it has taken the screenshot and saved somewhr in the memory.
//	
//	File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
//	sourcefile.renameTo(targetfile);
	
	//using webelement
	WebElement ele=driver.findElement(By.xpath("//img[@title='Show products in category Electronics']"));
	File sourcefile1=ele.getScreenshotAs(OutputType.FILE);
	File targetfile1=new File(System.getProperty("user.dir")+"\\Screenshots\\image.png");
	sourcefile1.renameTo(targetfile1);

	
	
	

	}
}
