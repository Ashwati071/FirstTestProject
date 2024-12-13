package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement input=driver.findElement(By.xpath("//input[@id='name']")); //here we can pass the value using sendKeys() method.
	
	JavascriptExecutor js=(JavascriptExecutor)driver;  
	//since this is an interface, we cant create object also,there is no direct relationship between WebDriver and JavascriptExecutor so
	//we are doing typecasting.
	
	js.executeScript("arguments[0].setAttribute('value','Ashwati')",input ); //alternative of sendKeys()
	
	
	//clicking on element--- Alternate of click()
	WebElement radiobtn= driver.findElement(By.xpath("//input[@id='female']"));
	js.executeScript("arguments[0].click()",radiobtn );
	
	/*this we cn do only when we are getting element intercepted exception*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
