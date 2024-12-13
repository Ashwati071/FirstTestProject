package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
	public static void main(String[] args)
	{
        WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		//Min slider
		WebElement minSlider=driver.findElement(By.xpath("//div[@id='slider-range']//span[@style='left: 0%;']"));
		System.out.println("before moving the slider"+minSlider.getLocation());  //(59, 250)
		act.dragAndDropBy(minSlider,100,250).perform();         //sliding x axis 
		System.out.println("after moving the slider"+minSlider.getLocation());   //(158, 288)
		
		//max Slider
		WebElement maxSlider=driver.findElement(By.xpath("//div[@id='slider-range']//span[@style='left: 100%;']"));
		System.out.println("before moving the slider"+maxSlider.getLocation());    //(612, 288)
		act.dragAndDropBy(maxSlider,-100,288).perform();         //sliding slider backward 
		System.out.println("after moving the slider"+maxSlider.getLocation());   //(512, 250)
    
		
	}

}
