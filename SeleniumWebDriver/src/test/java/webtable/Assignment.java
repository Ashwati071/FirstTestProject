package webtable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	
	


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown1=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select list1 = new Select(dropdown1);
		
		list1.selectByValue("Mexico City");
		
		WebElement dropdown2=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select list2 = new Select(dropdown2);
		
		list2.selectByValue("Berlin");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		int rowcount=driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		System.out.println(rowcount);
		for(int row=1;row<rowcount;row++)
		{
			//String price=driver.findElement(By.xpath("//table[@class='table']//tr["+row+"]//td[6]")).getText();
			
			//System.out.print(price+" ");             //$472.56 $432.98 $200.98 $765.32 $233.98 
			
			//int priceamount=Integer.parseInt(price);

			
	        }

		}

	}


