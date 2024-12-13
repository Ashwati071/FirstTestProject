package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		//String myTitle=driver.getTitle();
		
		                //tag id = tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone");
//		or
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Iphone");

		               //tag class = tag.classname
		
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Iphone");//here we have to remove classname value after space..input.search-box-text ui-autocomplete-input
//		//or
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Iphone");
		
		             //tag attribute = tag[attribute="value"]
		
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Iphone");
//		//or
//		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Iphone");
		
		             // tag class attribute = "tag.classname[attribute='value']"
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Iphone");
		//or
		//driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Iphone");
		
		WebElement logo=driver.findElement(By.xpath("//img[@src='/public/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']"));
        System.out.println("Status of logo is "+logo.isDisplayed());
        
        boolean status=driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).isEnabled();
        System.out.println("status is "+status);
		
	}
	
	

}
