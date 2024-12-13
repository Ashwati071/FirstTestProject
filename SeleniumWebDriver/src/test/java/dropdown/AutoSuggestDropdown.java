package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		/*for(WebElement option:options) {
			if(option.getText().equals("selenium"))
			{
				option.click();
			}
		}*/
		
		for(int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
			if(options.get(i).getText().equals("selenium"))
			{
				options.get(i).click();
			}
		}

	}

}
