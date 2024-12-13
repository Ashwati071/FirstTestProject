package switchingmethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static  void main(String[] args) {

		WebDriver driver =  new ChromeDriver();
		//Thread.sleep(10000);
		
		driver.get("https://demo.opencart.com/");
		String title=driver.getTitle();	
		
		if(title.equals("Your Store"))
		{
			System.out.println("title verified");
		}
		else {
			System.out.println("not verified");
		}
		
		driver.close();
	}

}
