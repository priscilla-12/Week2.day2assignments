package week2.day2Assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ImagePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Image.html");
		  
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//img[contains(@src,'/home.png')]")).click();
	     driver.navigate().back();
	     
	     WebElement brokenImg = driver.findElement(By.xpath("//img[contains(@src,'abcd.jpg')]"));
	     String size = brokenImg.getAttribute("Width");
	     if (size.equals("0"))
				System.out.println("  image broken");
			else
				System.out.println("  image not broken");

		 

	}

}
