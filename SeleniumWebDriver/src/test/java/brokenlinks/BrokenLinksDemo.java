package brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/* 1)  Link  href="https://xyz.com"
 * 
 * 2)  https://xyz.com -->server ---> status code
 * 
 * 3)  status code >=400 --> broken link
 *     status code < 400 --> not a broken link
 * 
 */

public class BrokenLinksDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int totbrokenlinks=0;
		for(WebElement link:links)
		{
			String hrefattrbtvalue=link.getAttribute("href"); //here i got link in the form of String
			
			if(hrefattrbtvalue==null || hrefattrbtvalue.isEmpty())
			{
				System.out.println("not possible to check");                              //condition-1
			    continue;
			}
			//hit URL to the server
			try {
			URL linkURL =new URL(hrefattrbtvalue); //converted href value from String to URL
			HttpURLConnection conn=(HttpURLConnection)linkURL.openConnection(); //open connection to the server
			conn.connect();     //connect to the server
			
			int responsecode=conn.getResponseCode();
			if(responsecode>=400)
			{
				System.out.println(hrefattrbtvalue + "broken link");
				totbrokenlinks++;
			}
			else {
				System.out.println(hrefattrbtvalue + "not a broken link");
			}
			
			}
			catch(Exception e) 
			{
			}
			
		}
		System.out.println("Number of broken links "+ totbrokenlinks);

	}

}
