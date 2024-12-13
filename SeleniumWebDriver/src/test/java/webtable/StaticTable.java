package webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		int totRow = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int totCol = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		System.out.println("row count is "+totRow);
		System.out.println("column count is "+totCol);
        
		//traversing-- here 2D array concept is being used to traverse the static web table.
		//Thread.sleep(4000);
		/*for(int row=2;row<totRow;row++)
		{
			for(int col=1;col<totCol;col++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td["+col+"]")).getText();
				System.out.print(value+"\t");

			}
			System.out.println();

		}*/
		
		//print book name whose author is Mukesh from the table
		
		/*for(int row=2;row<totRow;row++) {
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td[2]")).getText();
            if(authorname.equals("Mukesh"))
            {
            	String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td[1]")).getText();
            	System.out.println(bookname);
            }
		}*/
		
		//Total price
		int add=0; 
		for(int row=2;row<=totRow;row++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]/td[4]")).getText(); //this will get the price amount from website in String format
			int priceamount=Integer.parseInt(price);
			add=add+priceamount;
		}
		System.out.println(add);

	}

}
