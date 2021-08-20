package week2.day2Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		 
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

 
		driver.findElement(By.id("No")).click();
		
		 
		WebElement unchecked = driver.findElement(By.xpath("//label[@for ='Unchecked']"));
		if (unchecked.isSelected())
			System.out.println("UnChecked is selected by default");
		else 
			System.out.println("Checked is selected by default");
				
		 
		int age = 30;
		if (age < 20) {
			driver.findElement(By.xpath("//label[contains (text(),'Select your age')]/following-sibling::input[@value ='0']")).click();
			System.out.println("age group is 1-20 years");
		}
		else if (age > 40) {
			driver.findElement(By.xpath("//label[contains (text(),'Select your age')]/following-sibling::input[@value ='2']")).click();
			System.out.println("age group is above 40 years");
		}
		else
			System.out.println("age group is 20-40 years");
 

	}

}
