package datepickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePickers {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		//method:1
		//driver.findElement(By.id("datepicker")).sendKeys("11/19/2024");

		//method:2
		driver.findElement(By.id("datepicker")).click();

		String expectedyear="2025";
		String expectedmonth="August";
		String expecteddate ="19";
        
		//select month and year.
		while(true) 
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if(currentmonth.equals(expectedmonth) && currentyear.equals(expectedyear))
			{
				break;

			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//clicking NEXT
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //clicking previous

		}


		//to select the particular date

		List<WebElement> totdates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for(WebElement date:totdates)
		{
			if(date.getText().equals(expecteddate))
			{
				date.click();
				break;
			}
		}


	}

}





