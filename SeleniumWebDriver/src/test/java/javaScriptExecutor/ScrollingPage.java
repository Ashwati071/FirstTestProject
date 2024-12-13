package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");   //https://www.countries-ofthe-world.com/flags-of-the-world.html
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		/*js.executeScript("window.scrollBy(0,1500)","" );
		System.out.println(js.executeScript("return window.pageYOffset;"));*/
		
//		WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		System.out.println(js.executeScript("return window.pageYOffset;"));    //1511.199951171875


		/*WebElement ele1=driver.findElement(By.xpath("//strong[normalize-space()='News']"));
		js.executeScript("arguments[0].scrollIntoView();", ele1);
		System.out.println(js.executeScript("return window.pageYOffset;"));*/    //2435.199951171875
		
		//scroll to end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		//scroll up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");


		

		
	}

}
