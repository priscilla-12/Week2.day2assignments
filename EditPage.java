package week2.day2Assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class EditPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Edit.html");
		  
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 
		 
		 driver.findElement(By.id("email address")).sendKeys("priscilla7845@gmail.com");
		 driver.findElement(By.xpath("//input[@value = 'Append ']")).sendKeys("Text \t");
		 
		 WebElement getText = driver.findElement(By.xpath("//input[@value = 'TestLeaf']"));
			String getTextValue = getText.getAttribute("value");
			System.out.println("The Default Text is : " + getTextValue);
			
			WebElement clearText = driver.findElement(By.xpath("//input[@value = 'Clear me!!']"));
			clearText.clear();
			
			WebElement isEnable = driver.findElement(By.xpath("//input[@disabled = 'true']"));
			boolean isEnabledvalue = isEnable.isEnabled();
			
			if (isEnabledvalue)
				System.out.println(" button is Enabled");
			else
				System.out.println(" button is Disabled");

	}

}
