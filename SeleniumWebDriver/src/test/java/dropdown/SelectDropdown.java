package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdownlist=driver.findElement(By.xpath("//select[@id='country']"));                        
		Select drp_down =new Select(dropdownlist);
		
		//select by Visibletext
		//drp_down.selectByVisibleText("Canada");
		//drp_down.selectByValue("uk");
		drp_down.selectByIndex(3);
		
		//capture all options from drop down
		List<WebElement> options = drp_down.getOptions();
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
	}

}
