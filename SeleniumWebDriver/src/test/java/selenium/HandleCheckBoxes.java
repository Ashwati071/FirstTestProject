package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//for single checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//multiple checkboxes
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*for(int i=0;i<checkBoxes.size();i++)
		{
			checkBoxes.get(i).click();
		}*/
		
		/*for(WebElement checkBox:checkBoxes)
		{
			checkBox.click();		
		}*/
		//click on last 3 checkboxes
		/*for(int i=checkBoxes.size()-3;i<checkBoxes.size();i++) {
			checkBoxes.get(i).click();
		}*/
		
		//click on 1st 3 checkboxes
		for(int i=0;i<checkBoxes.size()-3-1;i++) {
			checkBoxes.get(i).click();

		}
		
	}

}
