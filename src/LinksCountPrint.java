import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCountPrint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		System.out.println("No.of links on a page:");
		System.out.println(driver.findElements(By .tagName("a")).size());
		
		//Creating sub-driver by limiting the WebDriver scope.
		WebElement footerdriver= driver.findElement(By .id("gf-BIG"));  
		System.out.println("No.of links on the footer section:");
		System.out.println(footerdriver.findElements(By .tagName("a")).size());
	
		WebElement column1driver = footerdriver.findElement(By .xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("No.of links on the first column of the footer section:");
		System.out.println(column1driver.findElements(By .tagName("a")).size());
	
	
		//Clicking on each of the links and checking if the pages are opening.
		for(int i=1; i<column1driver.findElements(By .tagName("a")).size();i++) 
		{
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			column1driver.findElements(By .tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000L);
			
		}
			
		//Iterating to each page and printing out their title.
		Set<String> pages = driver.getWindowHandles();
		Iterator<String> it = pages.iterator();
		
		while(it.hasNext()) 
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
}
