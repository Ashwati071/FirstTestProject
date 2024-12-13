package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/"); // Here u can directly pass the URL in the String format or,
		
		/*URL myUrl = new URL("https://www.orangehrm.com/");  // here m creating object of URL class and then passing in to()method
		driver.navigate().to(myUrl);*/
		
		/*driver. get() - this method will only take String format
		 *but 
		 * navigate().to() - this will take String values and object of URL class
		 * Also, navigate().to() internally calling get() method only. but get() only accepts only String.
		 * So, when object is passed it will internally convert object to String then pass in get().
		 */
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();

		
	}

}
