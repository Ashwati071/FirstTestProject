package keyboardactions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement registerLink= driver.findElement(By.xpath("//div[@class='header-links']//ul//li//*[text()='Register']"));
		//perform mouse action= ctrl=click to open the register page in another tab
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(registerLink).keyUp(Keys.CONTROL).perform();		
		
	}

}
