import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By .id("terms-link")).click();
		
		System.out.println("Parent window - Before switching");
		System.out.println(driver.getTitle());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//Storing ids of two windows and then switching based on id and then performing actions on that window.
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> i= ids.iterator();
		String parentId = i.next();
		String childId = i.next();
		driver.switchTo().window(childId);
		
		System.out.println("Child window - After switching");
		System.out.println(driver.getTitle());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		driver.switchTo().window(parentId);
		System.out.println("Switching back to Parent window");
		System.out.println(driver.getTitle());
	
	}

}
