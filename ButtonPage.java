package week2.day2Assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Button.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("home")).click();
			
		 
			driver.navigate().back();
 
			WebElement position = driver.findElement(By.id("position"));
			Point xypoint = position.getLocation();
			int xvalue = xypoint.getX();
			int yvalue = xypoint.getY();
			System.out.println(" x point is :" + xvalue + "\n y point is :" + yvalue);
 
			WebElement color = driver.findElement(By.id("color"));
			String colorname = color.getAttribute("style");
			System.out.println("Background color is :" + colorname);

			WebElement size = driver.findElement(By.id("size")); 
			int height = size.getSize().getHeight();
			int width = size.getSize().getWidth();
			System.out.println("height and width is: " + height + "," + width);

		 

	}

}
