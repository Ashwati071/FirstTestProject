package switchingmethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingMethods2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		for(String winId:windowIds)
		{
			String title=driver.switchTo().window(winId).getTitle();
			/*this will return the title of all windows,if we want to perform any action on any specific window we cn use if 
			 * condition with .equals method.
			 */
			System.out.println(title);
			if(title.equals("OrangeHRM")) 
			{
				driver.close();
			}
			
		}
	}

}
