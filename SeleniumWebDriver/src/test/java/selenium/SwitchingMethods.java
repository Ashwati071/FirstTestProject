package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds=driver.getWindowHandles();//convert to List in order to use get method n retrieve windowIDs.and it does not have indexing concept.
		List<String> windowList = new ArrayList(windowIds);
		String parentId=windowList.get(0);
		System.out.println("parent id is "+parentId);//FC2A173565946F11B3A35FBAD7D272B0
		String childId=windowList.get(1);
		System.out.println("child id is "+childId); //C68D5DD720C45F8297C4685224D48B48
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle()); 
        //		driver.switchTo().window(childId).close();

	}

}
