package webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagination {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ecomdeveloper.com/demo/admin/index.php");
		driver.manage().window().maximize();
		
		//login into the application
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demoadmin");
        WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demopass");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='Login']")).sendKeys(Keys.ENTER);

		
		Thread.sleep(4000);

		driver.findElement(By.xpath("//ul[@id='menu']//li//a[text()=' Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse9']//li//a[text()='Customers']")).click();
		
		String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText(); //Showing 1 to 20 of 899 (45 Pages)

		String totPages =text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1); 
		//here will get the number of pages from text using substring and indexOf method
		
		int pageCount = Integer.parseInt(totPages);  //45
		
		for(int p=1; p<=3;p++)  //i did not take pagecount value as it will be time taking so taking p<=3
		{
			
			if(p>1) 
			{
				WebElement activepage=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
				activepage.click();
				Thread.sleep(3000);
			}
			
			//now the page is displayed based on the if condition now we hv to read the data from each page.
			
			int totrows=driver.findElements(By.xpath("//div[@class='table-responsive']//table//tbody//tr")).size();
			
			for(int row=1;row<=totrows;row++)
			{
				String emailIds=driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody//tr["+row+"]//td[3]")).getText();
				System.out.println(emailIds);
			}
			
			
		}
         
	}

}
