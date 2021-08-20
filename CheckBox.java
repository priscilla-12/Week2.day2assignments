package week2.day2Assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://www.leafground.com/pages/checkbox.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("(//section[@class = 'innerblock']//input)[1]")).click();
			driver.findElement(By.xpath("(//section[@class = 'innerblock']//input)[2]")).click();

		 
			WebElement checked = driver.findElement(By.xpath("(//section[@class ='innerblock']//input)[6]"));
			if (checked.isSelected())
				System.out.println("checked");
			else
				System.out.println("not checked");
 
			WebElement deselect = driver.findElement(By.xpath("(//section[@class ='innerblock']//input)[8]"));
			deselect.click();

	 
			driver.findElement(By.xpath("(//section[@class = 'innerblock']//input)[9]")).click();
			driver.findElement(By.xpath("(//section[@class = 'innerblock']//input)[10]")).click();
			driver.findElement(By.xpath("(//section[@class = 'innerblock']//input)[11]")).click();
			driver.findElement(By.xpath("(//section[@class = 'innerblock']//input)[12]")).click();
			driver.findElement(By.xpath("(//section[@class = 'innerblock']//input)[13]")).click();

	}

}
