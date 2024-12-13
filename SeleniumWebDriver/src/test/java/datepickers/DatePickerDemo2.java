package datepickers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();

		String expectedyear="2025";
		String expectedmonth="April";
		while(true)
		{
			WebElement dropdownlist=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select dropdown=new Select(dropdownlist);
			List<WebElement> options = dropdown.getOptions();
			for(WebElement option:options)
			{
				
				if(option.getText().equals(expectedmonth))
				{
					break;
				}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

		   }
			
	    }
	/*WebElement dropdownlist2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select dropdown2=new Select(dropdownlist2);
			List<WebElement> options1 = dropdown2.getOptions();
			for(WebElement option1:options1)
			{
				if(option1.getText().equals(expectedyear))
						{
					      dropdown2.selectByValue("2025");
					      break;
						}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}

		}*/


	}
	
}
	











