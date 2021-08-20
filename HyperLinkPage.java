package week2.day2Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 
		WebElement homePage = driver.findElement(By.linkText("Go to Home Page"));
		String link1 = homePage.getAttribute("href");
		homePage.click();
		driver.navigate().back();

	 
		WebElement link = driver.findElement(By.xpath("//a[contains (text() , ' to go without clicking me?')]"));
		String hyperLink = link.getAttribute("href");
		System.out.println("The hidden link is :" + hyperLink);

 
		WebElement brokenLink = driver.findElement(By.xpath("//a[text() = 'Verify am I broken?']"));
		brokenLink.click();

		 
		String title = driver.getTitle();
		if (title.contains("404"))
			System.out.println("The link is Broken");
		else
			System.out.println("The link is not Broken");
 
		driver.navigate().back();

		 
		WebElement homePage1 = driver.findElement(By.partialLinkText("Go to Home Page"));
		String link2 = homePage1.getAttribute("href");
		
		
		if (link1.equals(link2))
			System.out.println("the links are same");
		driver.get(link1);
		driver.navigate().back();

		 
		List<WebElement> numOfLinks = driver.findElements(By.tagName("a"));
		int sizeOfLink = numOfLinks.size();
		System.out.println("The Total number of links in the page is :" + sizeOfLink);


 

	}

}
