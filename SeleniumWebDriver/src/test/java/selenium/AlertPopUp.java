package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//driver.switchTo().alert().accept();  //to click on OK button on alert popup.
		//driver.switchTo().alert().dismiss(); //to click on CANCEL button on alert popup.

		//for retrieving text
		
		/*Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();*/
		
		//for prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("WELCOME");
		myalert.accept();
	}

}
